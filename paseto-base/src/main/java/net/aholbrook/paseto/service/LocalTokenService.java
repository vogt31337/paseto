package net.aholbrook.paseto.service;

import net.aholbrook.paseto.Paseto;
import net.aholbrook.paseto.Tuple;
import net.aholbrook.paseto.claims.ClaimCheck;
import net.aholbrook.paseto.claims.Claims;

import java.time.Duration;

public class LocalTokenService<_TokenType extends Token> extends TokenService<_TokenType> {
	private final KeyProvider keyProvider;

	public LocalTokenService(Paseto<_TokenType> paseto, KeyProvider keyProvider, Class<_TokenType> tokenClass) {
		this(paseto, keyProvider, Claims.DEFAULT_CLAIM_CHECKS, null, tokenClass);
	}

	public LocalTokenService(Paseto<_TokenType> paseto, KeyProvider keyProvider, ClaimCheck[] claims,
			Class<_TokenType> tokenClass) {
		this(paseto, keyProvider, claims, null, tokenClass);
	}

	public LocalTokenService(Paseto<_TokenType> paseto, KeyProvider keyProvider, Duration defaultValidityPeriod,
			Class<_TokenType> tokenClass) {
		this(paseto, keyProvider, Claims.DEFAULT_CLAIM_CHECKS, defaultValidityPeriod, tokenClass);
	}

	public LocalTokenService(Paseto<_TokenType> paseto, KeyProvider keyProvider, ClaimCheck[] claims,
			Duration defaultValidityPeriod, Class<_TokenType> tokenClass) {
		super(paseto, claims, defaultValidityPeriod, tokenClass);
		this.keyProvider = keyProvider;
	}

	@Override
	public String encode(_TokenType token) {
		validateToken(token);
		return paseto.encrypt(token, keyProvider.getSecretKey());
	}

	@Override
	public <_FooterType> String encode(_TokenType token, _FooterType footer) {
		validateToken(token);
		return paseto.encrypt(token, keyProvider.getSecretKey(), footer);
	}

	@Override
	public _TokenType decode(String token) {
		_TokenType result = paseto.decrypt(token, keyProvider.getSecretKey(), tokenClass);
		Claims.verify(result, claims);
		return result;
	}

	@Override
	public <_FooterType> _TokenType decode(String token, _FooterType footer) {
		_TokenType result = paseto.decrypt(token, keyProvider.getSecretKey(), footer, tokenClass);
		Claims.verify(result, claims);
		return result;
	}

	@Override
	public <_FooterType> Tuple<_TokenType, _FooterType> decodeWithFooter(String token, Class<_FooterType> footerClass) {
		Tuple<_TokenType, _FooterType> result
				= paseto.decryptWithFooter(token, keyProvider.getSecretKey(), tokenClass, footerClass);
		Claims.verify(result.a, claims);
		return result;
	}

	@Override
	public <_FooterType> _FooterType getFooter(String token, Class<_FooterType> footerClass) {
		return paseto.extractFooter(token, footerClass);
	}

	public interface KeyProvider {
		byte[] getSecretKey();
	}

	public static class Builder<_TokenType extends Token> {
		private final Paseto<_TokenType> paseto;
		private final Class<_TokenType> tokenClass;
		private final KeyProvider keyProvider;
		private Duration defaultValidityPeriod = null;
		private ClaimCheck[] claims = Claims.DEFAULT_CLAIM_CHECKS;

		public Builder(Paseto<_TokenType> paseto, Class<_TokenType> tokenClass, KeyProvider keyProvider) {
			this.paseto = paseto;
			this.tokenClass = tokenClass;
			this.keyProvider = keyProvider;
		}

		public Builder withDefaultValidityPeriod(Duration defaultValidityPeriod) {
			this.defaultValidityPeriod = defaultValidityPeriod;
			return this;
		}

		public Builder checkClaims(ClaimCheck[] claims) {
			this.claims = claims;
			return this;
		}
	}
}
