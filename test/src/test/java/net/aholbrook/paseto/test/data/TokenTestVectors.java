package net.aholbrook.paseto.test.data;

import net.aholbrook.paseto.service.KeyId;
import net.aholbrook.paseto.service.Token;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class TokenTestVectors {
	// q9Rq3FfaAyN8JWyVJhphybm9DaFNLVt2
	private static short[] TEST_KEY = new short[] {
			0x71, 0x39, 0x52, 0x71, 0x33, 0x46, 0x66, 0x61, 0x41, 0x79, 0x4e, 0x38, 0x4a, 0x57, 0x79, 0x56,
			0x4a, 0x68, 0x70, 0x68, 0x79, 0x62, 0x6d, 0x39, 0x44, 0x61, 0x46, 0x4e, 0x4c, 0x56, 0x74, 0x32
	};

	// SmpF7Y5DeSJFJxjMrnDSwnUv
	private static short[] TEST_NONCE = new short[] {
			0x53, 0x6d, 0x70, 0x46, 0x37, 0x59, 0x35, 0x44, 0x65, 0x53, 0x4a, 0x46,
			0x4a, 0x78, 0x6a, 0x4d, 0x72, 0x6e, 0x44, 0x53, 0x77, 0x6e, 0x55, 0x76
	};

	private static short[] TEST_SK = new short[] {
			0x45, 0x2c, 0x19, 0x69, 0xed, 0x48, 0x06, 0xc8, 0xd4, 0x8e, 0xe4, 0xc6, 0x70, 0xdf, 0x98, 0x01,
			0x83, 0xf6, 0x79, 0x66, 0x33, 0x78, 0x7b, 0x15, 0xa0, 0x3f, 0x09, 0xcb, 0x24, 0xee, 0xbe, 0x7c,
			0x43, 0x2f, 0xa8, 0x2f, 0xc6, 0x15, 0xa2, 0x31, 0x92, 0xc7, 0xcb, 0x24, 0xcd, 0x3d, 0xfc, 0x48,
			0x97, 0xc6, 0xe1, 0x13, 0xdb, 0x87, 0xdc, 0xed, 0x76, 0x04, 0xd3, 0x4d, 0x06, 0xc5, 0xb6, 0x8d
	};

	private static short[] TEST_PK = new short[] {
			0x43, 0x2f, 0xa8, 0x2f, 0xc6, 0x15, 0xa2, 0x31, 0x92, 0xc7, 0xcb, 0x24, 0xcd, 0x3d, 0xfc, 0x48,
			0x97, 0xc6, 0xe1, 0x13, 0xdb, 0x87, 0xdc, 0xed, 0x76, 0x04, 0xd3, 0x4d, 0x06, 0xc5, 0xb6, 0x8d
	};

	// paseto-base/test_v1_rsa
	private static short[] TEST_RSA_PRIVATE_KEY = new short[] {
			0x30, 0x82, 0x04, 0xbd, 0x02, 0x01, 0x00, 0x30, 0x0d, 0x06, 0x09, 0x2a, 0x86, 0x48, 0x86, 0xf7,
			0x0d, 0x01, 0x01, 0x01, 0x05, 0x00, 0x04, 0x82, 0x04, 0xa7, 0x30, 0x82, 0x04, 0xa3, 0x02, 0x01,
			0x00, 0x02, 0x82, 0x01, 0x01, 0x00, 0xb2, 0x82, 0xb5, 0x32, 0x72, 0x4e, 0x96, 0x46, 0x34, 0x99,
			0x47, 0x45, 0x2b, 0x64, 0xb0, 0xff, 0x15, 0x97, 0xf8, 0x42, 0x81, 0x61, 0x78, 0x50, 0x11, 0xe4,
			0x3a, 0x11, 0x87, 0xa9, 0x04, 0x66, 0xc4, 0x20, 0x27, 0x16, 0x26, 0x90, 0x9b, 0x86, 0x5f, 0x2f,
			0xdd, 0x1d, 0x46, 0x35, 0xa0, 0x25, 0xb5, 0xa3, 0x43, 0x94, 0xa2, 0xfa, 0x4b, 0xcf, 0xa9, 0x63,
			0x88, 0x6c, 0xd0, 0x30, 0x8b, 0x49, 0x11, 0xb2, 0xa7, 0x02, 0xc8, 0x9a, 0xa3, 0x8e, 0xbd, 0x80,
			0xde, 0xc7, 0xb3, 0x67, 0x22, 0x6a, 0xb5, 0x04, 0xec, 0x29, 0x48, 0x70, 0x37, 0xd5, 0x09, 0xdb,
			0x7e, 0x9f, 0x6b, 0xb0, 0x9a, 0x83, 0xcd, 0xd2, 0xf2, 0x0a, 0xc4, 0xd6, 0x64, 0xba, 0x6d, 0xf7,
			0xe5, 0xb7, 0xa1, 0xbb, 0x08, 0xe4, 0x72, 0x97, 0x78, 0x1b, 0x19, 0xe1, 0xcc, 0x1a, 0x50, 0xc4,
			0xef, 0x11, 0x05, 0x9f, 0xf4, 0x51, 0xe7, 0x2d, 0x81, 0x78, 0x04, 0x02, 0x83, 0x32, 0x55, 0x2d,
			0xe5, 0x0f, 0xb0, 0xd5, 0x87, 0x8a, 0x12, 0xf3, 0xd5, 0x59, 0x00, 0x7b, 0xbb, 0x85, 0x61, 0x3a,
			0x7f, 0x61, 0x17, 0xd9, 0x94, 0x5b, 0xc2, 0x62, 0x66, 0xca, 0x12, 0xa7, 0x5d, 0x1b, 0xda, 0x71,
			0x3c, 0xe0, 0x3f, 0x85, 0xce, 0x59, 0xe2, 0x6c, 0x12, 0xc0, 0x22, 0xa3, 0x55, 0x4b, 0x75, 0x2a,
			0x8e, 0x15, 0xcf, 0x25, 0x97, 0x25, 0x32, 0xb5, 0x05, 0x2a, 0xb2, 0x94, 0xec, 0xee, 0x2a, 0xc8,
			0x09, 0x16, 0xeb, 0x37, 0x23, 0x28, 0x15, 0x3f, 0xb1, 0xc8, 0x8e, 0xdc, 0x84, 0x09, 0xaf, 0x5b,
			0xd4, 0x2a, 0x3b, 0x11, 0xea, 0xf8, 0xcc, 0xa7, 0x0c, 0xc6, 0x2a, 0x8a, 0x47, 0x70, 0xf5, 0xef,
			0x26, 0x17, 0xb6, 0xdc, 0x77, 0xc0, 0x1c, 0xeb, 0x6b, 0x8c, 0xfa, 0xa2, 0xa3, 0x97, 0x9a, 0x2c,
			0xb7, 0x05, 0x95, 0x1e, 0x0c, 0x95, 0x02, 0x03, 0x01, 0x00, 0x01, 0x02, 0x82, 0x01, 0x00, 0x11,
			0xd9, 0x61, 0xf6, 0xd6, 0x59, 0x27, 0x4b, 0x83, 0xcc, 0xe3, 0xc4, 0x75, 0xcf, 0x4e, 0xa7, 0x62,
			0xe8, 0x5c, 0x29, 0x82, 0x38, 0x55, 0xc8, 0x63, 0xd1, 0x97, 0x40, 0xd3, 0x78, 0xc1, 0xf8, 0xe8,
			0x99, 0x72, 0x6f, 0x13, 0x92, 0x18, 0x0a, 0xfa, 0x8f, 0x95, 0xa3, 0x6c, 0xb6, 0xc5, 0xf9, 0x9f,
			0x4c, 0xe0, 0xe0, 0x06, 0xdf, 0xd2, 0x1e, 0xc4, 0x88, 0x30, 0x46, 0xf9, 0x16, 0x31, 0x87, 0x2f,
			0xde, 0xd6, 0x36, 0x40, 0x0a, 0xbe, 0x59, 0xf2, 0x76, 0xe5, 0x4f, 0xc0, 0x8f, 0x8a, 0x70, 0x73,
			0x03, 0x37, 0xfd, 0xf4, 0xc1, 0x4b, 0xc3, 0xe0, 0x85, 0x73, 0x06, 0xcb, 0xc4, 0xcf, 0xde, 0x68,
			0x01, 0x34, 0xb4, 0x80, 0xf4, 0x13, 0x04, 0x55, 0x24, 0x99, 0x72, 0xa0, 0x18, 0x4c, 0x8e, 0x53,
			0x2a, 0xf4, 0x16, 0x79, 0xa3, 0x0b, 0x3e, 0x82, 0x5e, 0xfe, 0xac, 0x8c, 0x0c, 0x6f, 0x68, 0x6a,
			0x5e, 0x09, 0x98, 0xbd, 0x30, 0xc8, 0x59, 0x9f, 0x5e, 0xa5, 0x77, 0x86, 0x27, 0x20, 0x09, 0x2f,
			0x75, 0xa8, 0x22, 0x23, 0x80, 0x35, 0x2a, 0xef, 0xe1, 0x75, 0x16, 0x51, 0xa8, 0x62, 0xa5, 0x93,
			0x50, 0xa6, 0xb0, 0x4d, 0x51, 0x48, 0x3a, 0x4b, 0x02, 0x7e, 0x94, 0x74, 0xa4, 0x97, 0xf6, 0x78,
			0xdd, 0xa1, 0xe9, 0x6e, 0xd0, 0x3a, 0x5c, 0xe8, 0xd9, 0x67, 0x7d, 0x93, 0x7a, 0xd7, 0xb9, 0xde,
			0xd7, 0x97, 0x28, 0xfb, 0xe7, 0x72, 0x6a, 0x65, 0x4c, 0x0e, 0x8c, 0xda, 0x03, 0xcd, 0x74, 0x15,
			0x21, 0x9b, 0x48, 0x23, 0xab, 0x4e, 0xa8, 0xa9, 0xfd, 0xb8, 0x32, 0x16, 0x59, 0x28, 0x31, 0xb9,
			0x3e, 0x2f, 0xe2, 0xbf, 0x4a, 0x61, 0xe0, 0x61, 0xc9, 0x04, 0x98, 0xaa, 0x2f, 0xb4, 0x81, 0x5c,
			0xce, 0xb2, 0x81, 0x19, 0x98, 0xfe, 0x36, 0x1f, 0x23, 0x56, 0xff, 0x24, 0x81, 0x87, 0xe1, 0x02,
			0x81, 0x81, 0x00, 0xd5, 0xec, 0x46, 0xec, 0x69, 0x94, 0xde, 0x56, 0xc7, 0x52, 0x4c, 0xaa, 0xb5,
			0x9d, 0x00, 0xcf, 0x71, 0xbd, 0xef, 0x72, 0x73, 0x1d, 0x0b, 0xfe, 0x80, 0x2d, 0x73, 0x2d, 0xe9,
			0x9e, 0xd1, 0x45, 0x87, 0x12, 0xd0, 0x23, 0x0f, 0x06, 0x92, 0xa8, 0x4e, 0x8e, 0x2e, 0xca, 0x34,
			0xf7, 0x01, 0xe2, 0x73, 0xea, 0xa9, 0x05, 0x4b, 0xd5, 0x0f, 0xcb, 0xc1, 0x26, 0x9c, 0x27, 0x7c,
			0x38, 0xda, 0x14, 0x04, 0x52, 0xe8, 0x35, 0x1f, 0x34, 0xb9, 0x4f, 0x6f, 0xef, 0xf4, 0x51, 0x4f,
			0x22, 0xbf, 0x02, 0x08, 0x51, 0xd1, 0x61, 0x00, 0xbc, 0xe4, 0xe4, 0x1b, 0x81, 0xd1, 0xe5, 0x84,
			0x3b, 0x58, 0xf7, 0x82, 0x1a, 0xce, 0x26, 0xde, 0xb5, 0xa0, 0x62, 0xf7, 0x2b, 0xce, 0x5f, 0x37,
			0xcb, 0xec, 0x11, 0x72, 0xe2, 0xef, 0x27, 0x74, 0x34, 0xc7, 0x7b, 0x6d, 0x86, 0xe6, 0x23, 0x3e,
			0xda, 0xf6, 0x4d, 0x02, 0x81, 0x81, 0x00, 0xd5, 0x9f, 0x4d, 0x1c, 0x45, 0xf2, 0x72, 0x90, 0x52,
			0xe5, 0x86, 0x42, 0xda, 0x39, 0x42, 0xdb, 0xef, 0x09, 0x4c, 0xed, 0x03, 0x2d, 0xfb, 0xb3, 0x37,
			0x9b, 0x21, 0xd9, 0xec, 0xb0, 0x2e, 0xcb, 0x25, 0xee, 0xd2, 0x58, 0xe1, 0xbc, 0x27, 0xa3, 0xfa,
			0xa5, 0xc6, 0xc0, 0xde, 0x55, 0x45, 0x0f, 0x99, 0xc9, 0x61, 0xa3, 0xff, 0x04, 0x9b, 0x02, 0x54,
			0xf4, 0x94, 0x2c, 0x52, 0xac, 0x8b, 0x80, 0xe3, 0x51, 0xbe, 0x8d, 0x9e, 0x4c, 0x25, 0xf3, 0xfb,
			0xb7, 0x13, 0x86, 0x7e, 0xf3, 0x2a, 0xaf, 0xda, 0x4f, 0xcc, 0x91, 0xa1, 0x99, 0x9c, 0xb9, 0xce,
			0xd3, 0x8e, 0x3f, 0xed, 0x49, 0x67, 0x45, 0x7b, 0xc6, 0x4a, 0xb2, 0x3c, 0x82, 0xff, 0x78, 0x6c,
			0xa3, 0xeb, 0x2b, 0x1f, 0xec, 0x9d, 0xec, 0x6a, 0x5a, 0x65, 0x33, 0x02, 0x39, 0xd4, 0xcc, 0xdb,
			0x4b, 0x4b, 0x6a, 0x62, 0x6c, 0xa3, 0x69, 0x02, 0x81, 0x81, 0x00, 0xae, 0xf0, 0x6c, 0x07, 0x85,
			0x48, 0x22, 0x92, 0xe0, 0xa9, 0x62, 0xdc, 0xef, 0x6c, 0x17, 0x6f, 0x8d, 0x5a, 0x7f, 0xe8, 0x1e,
			0x4f, 0x10, 0xb1, 0xed, 0x6c, 0x3d, 0x96, 0xbc, 0x48, 0x0e, 0x67, 0x47, 0x50, 0x91, 0x39, 0x3a,
			0x5e, 0x6b, 0xac, 0x8b, 0xa1, 0x26, 0x8e, 0x61, 0xc5, 0xe5, 0x9a, 0xa4, 0xa4, 0xaf, 0xd8, 0x0e,
			0xed, 0x8b, 0xdf, 0x5a, 0x73, 0x12, 0x9c, 0x0f, 0xb0, 0x06, 0x56, 0xfc, 0x3a, 0x38, 0x7e, 0xc8,
			0xa8, 0x3b, 0x2a, 0xc5, 0x25, 0x7b, 0xac, 0xca, 0x84, 0x65, 0xa3, 0x69, 0xde, 0x4e, 0xd5, 0x7e,
			0xde, 0xfa, 0x67, 0xb8, 0x3e, 0xef, 0xc1, 0x3b, 0xe3, 0xb4, 0x9b, 0xa3, 0x9f, 0xfc, 0x1a, 0x39,
			0x62, 0x5a, 0x68, 0xd4, 0x2c, 0xd4, 0xb5, 0x75, 0x51, 0xa4, 0x19, 0x98, 0xd4, 0x10, 0x33, 0x39,
			0x8a, 0xb7, 0xdf, 0x2d, 0xf0, 0x75, 0x5f, 0x39, 0x55, 0xa2, 0xb9, 0x02, 0x81, 0x80, 0x3d, 0x83,
			0xb9, 0xf8, 0xc2, 0x4b, 0xa6, 0xa1, 0xd8, 0xbd, 0x2f, 0x84, 0x60, 0xc2, 0xcc, 0x75, 0xf8, 0xc7,
			0x7c, 0xd7, 0x63, 0x6b, 0x02, 0x68, 0x01, 0x43, 0x32, 0xe4, 0x46, 0x3c, 0x15, 0xbd, 0x7a, 0x16,
			0xe3, 0x8b, 0xa4, 0xb5, 0x41, 0xd4, 0xfe, 0x80, 0x6e, 0x53, 0x6b, 0xb2, 0xb2, 0x48, 0x63, 0xc8,
			0x91, 0xcd, 0x5f, 0xca, 0x3b, 0xb8, 0xd8, 0x2d, 0xf5, 0xdd, 0x2d, 0x91, 0x72, 0x3a, 0x93, 0x3b,
			0x1e, 0xdc, 0x39, 0x11, 0x44, 0x7c, 0x95, 0xa7, 0x8a, 0x7f, 0xd8, 0x5e, 0xbd, 0x94, 0x16, 0x11,
			0x94, 0x9e, 0xfb, 0x21, 0xf8, 0xf7, 0xa8, 0x8f, 0x53, 0x0f, 0x25, 0x8d, 0x55, 0xa7, 0xb4, 0x94,
			0xcd, 0x3d, 0xb6, 0x1f, 0x22, 0xe1, 0xd2, 0xa7, 0x01, 0x39, 0x51, 0xe0, 0x19, 0x39, 0xd3, 0x06,
			0x64, 0xcd, 0xe3, 0x7e, 0x33, 0xc1, 0x2a, 0x04, 0xec, 0x9a, 0x9d, 0xed, 0x1a, 0xc1, 0x02, 0x81,
			0x80, 0x2a, 0x56, 0xa5, 0xda, 0xc6, 0x34, 0xa1, 0x4a, 0x69, 0x33, 0x54, 0xf0, 0x00, 0xc6, 0xd0,
			0xd8, 0x12, 0xa6, 0xb1, 0x23, 0x78, 0xfd, 0xc8, 0xd1, 0xd6, 0xa2, 0x42, 0xd8, 0x52, 0x86, 0x63,
			0x1e, 0xd6, 0x6a, 0x9c, 0xb8, 0x67, 0x96, 0x63, 0x31, 0x3a, 0x62, 0x9e, 0x1c, 0xe7, 0x39, 0x1b,
			0x35, 0x06, 0x31, 0x34, 0x14, 0xc8, 0x8b, 0x3f, 0x4d, 0x8e, 0xa2, 0xdc, 0x3a, 0x0f, 0x97, 0x4b,
			0xa0, 0x1a, 0x34, 0xef, 0x42, 0x80, 0xd4, 0xab, 0xd5, 0xed, 0x55, 0xdd, 0x64, 0x5f, 0x77, 0x5a,
			0x6d, 0x30, 0x85, 0xf0, 0xd4, 0xd2, 0x47, 0x73, 0x27, 0xa4, 0xff, 0x81, 0x0a, 0x4f, 0x88, 0xa3,
			0x9a, 0xdc, 0x10, 0x40, 0x90, 0x0e, 0x9d, 0xe1, 0x44, 0x15, 0x78, 0xd4, 0x2f, 0xd9, 0x97, 0x7e,
			0xf2, 0x30, 0x69, 0x16, 0x1a, 0x88, 0x2c, 0x59, 0x40, 0x3e, 0x87, 0xbd, 0xa2, 0x5d, 0xe0, 0xa9,
			0x8c
	};

	// paseto-base/test_v1_rsa.pub
	private static short[] TEST_RSA_PUBLIC_KEY = new short[] {
			0x30, 0x82, 0x01, 0x22, 0x30, 0x0d, 0x06, 0x09, 0x2a, 0x86, 0x48, 0x86, 0xf7, 0x0d, 0x01, 0x01,
			0x01, 0x05, 0x00, 0x03, 0x82, 0x01, 0x0f, 0x00, 0x30, 0x82, 0x01, 0x0a, 0x02, 0x82, 0x01, 0x01,
			0x00, 0xb2, 0x82, 0xb5, 0x32, 0x72, 0x4e, 0x96, 0x46, 0x34, 0x99, 0x47, 0x45, 0x2b, 0x64, 0xb0,
			0xff, 0x15, 0x97, 0xf8, 0x42, 0x81, 0x61, 0x78, 0x50, 0x11, 0xe4, 0x3a, 0x11, 0x87, 0xa9, 0x04,
			0x66, 0xc4, 0x20, 0x27, 0x16, 0x26, 0x90, 0x9b, 0x86, 0x5f, 0x2f, 0xdd, 0x1d, 0x46, 0x35, 0xa0,
			0x25, 0xb5, 0xa3, 0x43, 0x94, 0xa2, 0xfa, 0x4b, 0xcf, 0xa9, 0x63, 0x88, 0x6c, 0xd0, 0x30, 0x8b,
			0x49, 0x11, 0xb2, 0xa7, 0x02, 0xc8, 0x9a, 0xa3, 0x8e, 0xbd, 0x80, 0xde, 0xc7, 0xb3, 0x67, 0x22,
			0x6a, 0xb5, 0x04, 0xec, 0x29, 0x48, 0x70, 0x37, 0xd5, 0x09, 0xdb, 0x7e, 0x9f, 0x6b, 0xb0, 0x9a,
			0x83, 0xcd, 0xd2, 0xf2, 0x0a, 0xc4, 0xd6, 0x64, 0xba, 0x6d, 0xf7, 0xe5, 0xb7, 0xa1, 0xbb, 0x08,
			0xe4, 0x72, 0x97, 0x78, 0x1b, 0x19, 0xe1, 0xcc, 0x1a, 0x50, 0xc4, 0xef, 0x11, 0x05, 0x9f, 0xf4,
			0x51, 0xe7, 0x2d, 0x81, 0x78, 0x04, 0x02, 0x83, 0x32, 0x55, 0x2d, 0xe5, 0x0f, 0xb0, 0xd5, 0x87,
			0x8a, 0x12, 0xf3, 0xd5, 0x59, 0x00, 0x7b, 0xbb, 0x85, 0x61, 0x3a, 0x7f, 0x61, 0x17, 0xd9, 0x94,
			0x5b, 0xc2, 0x62, 0x66, 0xca, 0x12, 0xa7, 0x5d, 0x1b, 0xda, 0x71, 0x3c, 0xe0, 0x3f, 0x85, 0xce,
			0x59, 0xe2, 0x6c, 0x12, 0xc0, 0x22, 0xa3, 0x55, 0x4b, 0x75, 0x2a, 0x8e, 0x15, 0xcf, 0x25, 0x97,
			0x25, 0x32, 0xb5, 0x05, 0x2a, 0xb2, 0x94, 0xec, 0xee, 0x2a, 0xc8, 0x09, 0x16, 0xeb, 0x37, 0x23,
			0x28, 0x15, 0x3f, 0xb1, 0xc8, 0x8e, 0xdc, 0x84, 0x09, 0xaf, 0x5b, 0xd4, 0x2a, 0x3b, 0x11, 0xea,
			0xf8, 0xcc, 0xa7, 0x0c, 0xc6, 0x2a, 0x8a, 0x47, 0x70, 0xf5, 0xef, 0x26, 0x17, 0xb6, 0xdc, 0x77,
			0xc0, 0x1c, 0xeb, 0x6b, 0x8c, 0xfa, 0xa2, 0xa3, 0x97, 0x9a, 0x2c, 0xb7, 0x05, 0x95, 0x1e, 0x0c,
			0x95, 0x02, 0x03, 0x01, 0x00, 0x01
	};

	public final static Token TOKEN_1 = new Token()
			.setIssuer("paragonie.com")
			.setSubject("test")
			.setAudience("pie-hosted.com")
			.setExpiration(OffsetDateTime.of(LocalDate.of(2039, 1, 1),
				LocalTime.of(0, 0, 0), ZoneOffset.UTC))
			.setNotBefore(OffsetDateTime.of(LocalDate.of(2038, 4, 1),
				LocalTime.of(0, 0, 0), ZoneOffset.UTC))
			.setIssuedAt(OffsetDateTime.of(LocalDate.of(2038, 3, 17),
				LocalTime.of(0, 0, 0), ZoneOffset.UTC))
			.setTokenId("87IFSGFgPNtQNNuw0AtuLttP");
	private final static KeyId TOKEN_1_FOOTER = new KeyId().setKeyId("key-1");
	public final static String TOKEN_1_STRING = "{\"exp\":\"2039-01-01T00:00:00+00:00\",\"iss\":\"paragonie.com\","
			+ "\"sub\":\"test\",\"aud\":\"pie-hosted.com\",\"jti\":\"87IFSGFgPNtQNNuw0AtuLttP\","
			+ "\"nbf\":\"2038-04-01T00:00:00+00:00\",\"iat\":\"2038-03-17T00:00:00+00:00\"}";
	private final static String TOKEN_1_V1_LOCAL
			= "v1.local.m6N_QKd4XTRmXT-q2VJbh2A4QqVy2Cp26f3kx837_wsZI16E44Fpz1ha_ze2T2obkEfp--ZbCRCc5GFJxiHk-X99BGUrQXc"
			+ "-S1Zu5TUVBqPMh5dcLqhD41AccpGKGKI0DPGgLSrf0euLlJIhwDsxR2WdPRCRMa46hZ9aUZw9We2gFjM12cfH9qDc4dFq7AMyEsYvUML"
			+ "VDV5xuapW12-C3m1AgDQaeQUUC0Lcl6f-UGrR0VCszpZtzfw1aNSofS7yHkGE0G6ENZ1WgdzdWiXQn97qi18YD756_Vsv5VJVuVOBFXs"
			+ "mcluDcDhVh11010OWK858NNN4u1z8UORAv1e3Gzuz5ZdcX3-GmQQv7OuVv6UAEg";
	private final static String TOKEN_1_V1_LOCAL_WITH_FOOTER
			= "v1.local.m6N_QKd4XTRmXT-q2VJbh2A4QqVy2Cp26f3kx837_wsZI16E44Fpz1ha_ze2T2obkEfp--ZbCRCc5GFJxiHk-X99BGUrQXc"
			+ "-S1Zu5TUVBqPMh5dcLqhD41AccpGKGKI0DPGgLSrf0euLlJIhwDsxR2WdPRCRMa46hZ9aUZw9We2gFjM12cfH9qDc4dFq7AMyEsYvUML"
			+ "VDV5xuapW12-C3m1AgDQaeQUUC0Lcl6f-UGrR0VCszpZtzfw1aNSofS7yHkGE0G6ENZ1WgdzdWiXQn97qi18YD756_Vsv5VJVuVOBFQN"
			+ "tZ4EF_vCbxUlY87KndoN-ilJDQDd-WK4yqAVHcVW3uYNGgD1OZLw9Ases7jUqAw.eyJraWQiOiJrZXktMSJ9";
	private final static String TOKEN_1_V1_PUBLIC
			= "v1.public.eyJleHAiOiIyMDM5LTAxLTAxVDAwOjAwOjAwKzAwOjAwIiwiaXNzIjoicGFyYWdvbmllLmNvbSIsInN1YiI6InRlc3QiLC"
			+ "JhdWQiOiJwaWUtaG9zdGVkLmNvbSIsIm5iZiI6IjIwMzgtMDQtMDFUMDA6MDA6MDArMDA6MDAiLCJpYXQiOiIyMDM4LTAzLTE3VDAwOj"
			+ "AwOjAwKzAwOjAwIiwianRpIjoiODdJRlNHRmdQTnRRTk51dzBBdHVMdHRQIn0OUAoUC1JXZRCAk3RGxnpVdH1fB0nN5_wBa9Z7F0aBVA"
			+ "dKBQCUkB5OwNcUNlE7R_MR1D1seWFgj0xTSIBQHEFhatBpBpO2QUT16FR0VdxG-coTLReCN5d_TvYzSsKCA2I1H9UXlQBfJIfNXJHeQ9"
			+ "tnZZKXhkq93Jxg6tStBTpL1vFpvvzcxTgacLUobGllKetDn9mdtbq_SOQ2fM840T0BXeGaEFrWYDO9WPf8t9aAGKYwV1lh7tYTl9B5Zt"
			+ "GVzdPJdljvsyCKTTwRxhvWDL3e6Jy02H_1cZjOkoH8fLpqmeyEQA5-swzVwTaaGpgYGU_gZWMgofFWjQeQ-BTaL6VA";
	private final static String TOKEN_1_V1_PUBLIC_WITH_FOOTER
			= "v1.public.eyJleHAiOiIyMDM5LTAxLTAxVDAwOjAwOjAwKzAwOjAwIiwiaXNzIjoicGFyYWdvbmllLmNvbSIsInN1YiI6InRlc3QiLC"
			+ "JhdWQiOiJwaWUtaG9zdGVkLmNvbSIsIm5iZiI6IjIwMzgtMDQtMDFUMDA6MDA6MDArMDA6MDAiLCJpYXQiOiIyMDM4LTAzLTE3VDAwOj"
			+ "AwOjAwKzAwOjAwIiwianRpIjoiODdJRlNHRmdQTnRRTk51dzBBdHVMdHRQIn1DMRW-gRvx5db1UFNWzxZVJDZjVD4cmkSWPsdAnXzzjo"
			+ "Yn1JccSIWllUz5mKvvCoYMoJbY3iXORq2M3Unct9C9GaTM2eGp6c9C5vSZ7OIMFU3crZ3y_6k2XGx_qcLbQSs2jPtfi5mKIT0qIIVkDy"
			+ "78lDG3muQP4ox3f0zJpqhZnRaU4gA9Ht4n4-yUm8jZMw85R2NOJ2a7nMlZPtuUPtAcOeWzr0EaHLFrqNhtvwakT-kATj_DWHaUgP8mUj"
			+ "Dj_dH0mxLV9xyDeV14aUg92Jh-ddMxE7dNVoBZxWQ2qwoV0UEUgzTu6Eg-m1etuFMb9HopeYRBJrLvB0loyxo5boHi.eyJraWQiOiJrZ"
			+ "XktMSJ9";
	private final static String TOKEN_1_V2_LOCAL
			= "v2.local.3kYO_Lnf8Ff8l-R5MDUE6OHeS5TrBjl4Hc3Z8bJDMDzuOCjFHpzkjB135N7hcYs6RmwknxD5ziidhQKexbVxYYFAOW6QSQb"
			+ "v9Mdrd4KSRKXIXMfAIB_QFVKPb2-u3NREHsBAgooPVv5qezQJEObCgEpRuUizbJhmx4BbJ2yZ_GRpnOZpwfPdViC7hWULo19K2uhnVX2"
			+ "72pzIKQY5BJBTfExlsFuYF0zb_a3t5rFds_AOz4Ax9hLcpl6qHE-bubfleg2DPY0OqYKvHXgmBjnygVK7t_h7QRwASmbGPGaucITuq29"
			+ "DaygqjvEB";
	private final static String TOKEN_1_V2_LOCAL_WITH_FOOTER
			= "v2.local.3kYO_Lnf8Ff8l-R5MDUE6OHeS5TrBjl4Hc3Z8bJDMDzuOCjFHpzkjB135N7hcYs6RmwknxD5ziidhQKexbVxYYFAOW6QSQb"
			+ "v9Mdrd4KSRKXIXMfAIB_QFVKPb2-u3NREHsBAgooPVv5qezQJEObCgEpRuUizbJhmx4BbJ2yZ_GRpnOZpwfPdViC7hWULo19K2uhnVX2"
			+ "72pzIKQY5BJBTfExlsFuYF0zb_a3t5rFds_AOz4Ax9hLcpl6qHE-bubfleg2DPY0OqYKvHXgmBjnygVK7t_h7QRwASmamxVzMUpRu-PG"
			+ "4eB9bBWeP.eyJraWQiOiJrZXktMSJ9";
	private final static String TOKEN_1_V2_PUBLIC
			= "v2.public.eyJpc3MiOiJwYXJhZ29uaWUuY29tIiwic3ViIjoidGVzdCIsImF1ZCI6InBpZS1ob3N0ZWQuY29tIiwiZXhwIjoiMjAzOS"
			+ "0wMS0wMVQwMDowMDowMCswMDowMCIsIm5iZiI6IjIwMzgtMDQtMDFUMDA6MDA6MDArMDA6MDAiLCJpYXQiOiIyMDM4LTAzLTE3VDAwOj"
			+ "AwOjAwKzAwOjAwIiwianRpIjoiODdJRlNHRmdQTnRRTk51dzBBdHVMdHRQIn3esDcxyrLvjdUVc4qJJdDlePpvR6meN9eQYbHCigSL8j"
			+ "kJi6fTfeyzL2kRBfwuIro50vE3iqrQVIHhXTA_mNIK";
	private final static String TOKEN_1_V2_PUBLIC_WITH_FOOTER
			= "v2.public.eyJpc3MiOiJwYXJhZ29uaWUuY29tIiwic3ViIjoidGVzdCIsImF1ZCI6InBpZS1ob3N0ZWQuY29tIiwiZXhwIjoiMjAzOS"
			+ "0wMS0wMVQwMDowMDowMCswMDowMCIsIm5iZiI6IjIwMzgtMDQtMDFUMDA6MDA6MDArMDA6MDAiLCJpYXQiOiIyMDM4LTAzLTE3VDAwOj"
			+ "AwOjAwKzAwOjAwIiwianRpIjoiODdJRlNHRmdQTnRRTk51dzBBdHVMdHRQIn2xoKvT1qvd3J2tLSWXepCJl7TJNiPBobAfU8OQtsU9qF"
			+ "o_K0TZVmdOB-mDFAbv6VXsgercqOAoIK0o3Fa-JA8D.eyJraWQiOiJrZXktMSJ9";
	public final static TestVector<Token, Void> TV_1_V1_LOCAL = new TestVector<>(testKey(), testNonce(), TOKEN_1,
			Token.class, null, TOKEN_1_V1_LOCAL);
	public final static TestVector<Token, KeyId> TV_1_V1_LOCAL_WITH_FOOTER = new TestVector<>(testKey(), testNonce(),
			TOKEN_1, Token.class, TOKEN_1_FOOTER, TOKEN_1_V1_LOCAL_WITH_FOOTER);
	public final static TestVector<Token, Void> TV_1_V1_PUBLIC = new TestVector<>(testV1PrivateKey(), testV1PublicKey(),
			TOKEN_1, Token.class, null, TOKEN_1_V1_PUBLIC);
	public final static TestVector<Token, KeyId> TV_1_V1_PUBLIC_WITH_FOOTER = new TestVector<>(testV1PrivateKey(),
			testV1PublicKey(), TOKEN_1, Token.class, TOKEN_1_FOOTER, TOKEN_1_V1_PUBLIC_WITH_FOOTER);
	public final static TestVector<Token, Void> TV_1_V2_LOCAL = new TestVector<>(testKey(), testNonce(), TOKEN_1,
			Token.class, null, TOKEN_1_V2_LOCAL);
	public final static TestVector<Token, KeyId> TV_1_V2_LOCAL_WITH_FOOTER = new TestVector<>(testKey(), testNonce(),
			TOKEN_1, Token.class, TOKEN_1_FOOTER, TOKEN_1_V2_LOCAL_WITH_FOOTER);
	public final static TestVector<Token, Void> TV_1_V2_PUBLIC = new TestVector<>(testV2SecretKey(), testV2PublicKey(),
			TOKEN_1, Token.class, null, TOKEN_1_V2_PUBLIC);
	public final static TestVector<Token, KeyId> TV_1_V2_PUBLIC_WITH_FOOTER = new TestVector<>(testV2SecretKey(),
			testV2PublicKey(), TOKEN_1, Token.class, TOKEN_1_FOOTER, TOKEN_1_V2_PUBLIC_WITH_FOOTER);

	public final static CustomToken TOKEN_2 = (CustomToken) new CustomToken()
			.setUserId(100L)
			.setIssuer("auth.example.com")
			.setSubject("user-auth")
			.setAudience("internal-service.example.com")
			.setExpiration(OffsetDateTime.of(LocalDate.of(2018, 1, 1),
					LocalTime.of(17, 23, 44), ZoneOffset.UTC))
			.setIssuedAt(OffsetDateTime.of(LocalDate.of(2018, 1, 1),
					LocalTime.of(17, 18, 44), ZoneOffset.UTC))
			.setNotBefore(OffsetDateTime.of(LocalDate.of(2018, 1, 1),
					LocalTime.of(17, 18, 44), ZoneOffset.UTC));
	private final static KeyId TOKEN_2_FOOTER = new KeyId().setKeyId("key-1");
	public final static String TOKEN_2_STRING = "{\"userId\":100,\"exp\":\"2018-01-01T17:23:44+00:00\","
			+ "\"sub\":\"user-auth\",\"iss\":\"auth.example.com\",\"aud\":\"internal-service.example.com\","
			+ "\"jti\":null,\"nbf\":\"2018-01-01T17:18:44+00:00\",\"iat\":\"2018-01-01T17:18:44+00:00\"}";
	private final static String TOKEN_2_V1_LOCAL
			= "v1.local.1Y6hP7JezXKcufqg4wG88Zn8WeijDUYRAv-w-iqRfvVE5BWegNkdXDItmzlyAxv5_kYzTULJ7KcNDADSuwb59DaYyYWW3f8"
			+ "U4M0WTt_zEBC30mdf1PWZe-ET6HnZHdQ7cZSmSJjAS69s2PJF9Sugj_8IZEusVmeIoUdO1cDgog4UOb287YafnF73un3j-NstSXcBFWX"
			+ "x-yUm9dzvh7EeZ-rIZrpZO4lLmuYkUaFGlCiiKrjCyGWaVG-EsnGcxUR_LKC_RF9Zf5MSd5vED7hPMXxqqsCLT_Kp04suk7wFgsKe6dO"
			+ "SKnVOk6BvTUElLh6zXLSrxZtBDrXxXQihqKyewMnCCqasx5RU-Sj0YvcXRvwHmnAT";
	private final static String TOKEN_2_V1_LOCAL_WITH_FOOTER
			= "v1.local.1Y6hP7JezXKcufqg4wG88Zn8WeijDUYRAv-w-iqRfvVE5BWegNkdXDItmzlyAxv5_kYzTULJ7KcNDADSuwb59DaYyYWW3f8"
			+ "U4M0WTt_zEBC30mdf1PWZe-ET6HnZHdQ7cZSmSJjAS69s2PJF9Sugj_8IZEusVmeIoUdO1cDgog4UOb287YafnF73un3j-NstSXcBFWX"
			+ "x-yUm9dzvh7EeZ-rIZrpZO4lLmuYkUaFGlCiiKrjCyGWaVG-EsnGcxUR_LKC_RF9Zf5MSd5vED7hPMXxqqsCLT_Kp04suk7wFgsKe6dO"
			+ "SYsXpzLVjiQg1uWWUbSZCgYu90pbaZ9pZ8qBB5XDTTgZ9quaaEKt2RhtF3Dbr9ThE.eyJraWQiOiJrZXktMSJ9";
	private final static String TOKEN_2_V1_PUBLIC
			= "v1.public.eyJ1c2VySWQiOjEwMCwiZXhwIjoiMjAxOC0wMS0wMVQxNzoyMzo0NCswMDowMCIsImlzcyI6ImF1dGguZXhhbXBsZS5jb2"
			+ "0iLCJzdWIiOiJ1c2VyLWF1dGgiLCJhdWQiOiJpbnRlcm5hbC1zZXJ2aWNlLmV4YW1wbGUuY29tIiwibmJmIjoiMjAxOC0wMS0wMVQxNz"
			+ "oxODo0NCswMDowMCIsImlhdCI6IjIwMTgtMDEtMDFUMTc6MTg6NDQrMDA6MDAifTk_6iNDYl4u-G-1vlfDlLbcLjBb-eyn76TJsovnVd"
			+ "aFHcjKMd7z-KH7pkE-VXSwof-F08gvVTstNqDEXbJsNsylqQ3XxvDmgBGY8S6Jtz8EC9baYumITHfKUjPTi9yVBQiH-cre03565Ioe9B"
			+ "fsksWDP6mPHpDAibI9FDVTponvJ2FYA4p4UKHxQW2vaIzPZSIb9qvy5Vs5sv9u_skuMliD1mir_vgLYK_7YjncHqq5TyNgwwO6Xnx7qZ"
			+ "9ADS-ut9tje89NzFZzGBeW_vQTcgJCoE_r82YawXwLforxpnv1VV0HaLxFWzCx5WJc02udWeVOmhmpPBCAQyuV5JsQFlM";
	private final static String TOKEN_2_V1_PUBLIC_WITH_FOOTER
			= "v1.public.eyJ1c2VySWQiOjEwMCwiZXhwIjoiMjAxOC0wMS0wMVQxNzoyMzo0NCswMDowMCIsImlzcyI6ImF1dGguZXhhbXBsZS5jb2"
			+ "0iLCJzdWIiOiJ1c2VyLWF1dGgiLCJhdWQiOiJpbnRlcm5hbC1zZXJ2aWNlLmV4YW1wbGUuY29tIiwibmJmIjoiMjAxOC0wMS0wMVQxNz"
			+ "oxODo0NCswMDowMCIsImlhdCI6IjIwMTgtMDEtMDFUMTc6MTg6NDQrMDA6MDAifZHKYq5llXY3dUuAaUvc9IOcqsoJIDqs8ygrwAHiNs"
			+ "2GDsvozdEGz-07CKOk7mB3LHQdJuk5SGCwBlEwVbg-db15JT4cVPJkJVxGqFCZ_M1kjIasiVmoyJqrI-hF4SYDhsb6qVf6ymmWYZX5jz"
			+ "R8T-ekAVz8OGEHNQiHtlGR2RZRwhIfG1t5lyQtiniD8gMFd3bM6Wa6fuNQeXqjn-GC53w9JZGUyNZNLgWd5ouGJlWfU8Ar2m5E5HeLxa"
			+ "pLlXL5gb002ELnTgPxxoT_N6EAslXh1tAmH2fVOT729veD2R8uXgXMCiG2Q0JT_aJl9PpAwhmbm4KUQ1mpVa9sS5ro5X4.eyJraWQiOi"
			+ "JrZXktMSJ9";
	private final static String TOKEN_2_V2_LOCAL
			= "v2.local.WZ4x3NRzj5zuA5fjnaCAmaCgD-gdFDM9yUvoRnqyhGG1wt44Xh1BjWMx1jx8rVH1My5xB66KfSgG1RFiyJz9iyamU76DMyh"
			+ "6sn_a_c3dqmqWSsiF7_3Sbbv8v9AeJfs7sREiBX4QpJxbzpP-CLDSOyOF0fBBpZ3DrigrOBf21bzYdcFL93NpmCCgejttW-MTiLc1a7A"
			+ "IJJLSxYrk_D2VARx1oXO5Vg6bq904ev6zcIfgYHepYk2y_evZgLs_kEFmhKWQZvs1otGoqwDsY5Balpx1rs20T1X8MJDQFzAJaa2Jq9q"
			+ "tUqSrM65dPd8";
	private final static String TOKEN_2_V2_LOCAL_WITH_FOOTER
			= "v2.local.WZ4x3NRzj5zuA5fjnaCAmaCgD-gdFDM9yUvoRnqyhGG1wt44Xh1BjWMx1jx8rVH1My5xB66KfSgG1RFiyJz9iyamU76DMyh"
			+ "6sn_a_c3dqmqWSsiF7_3Sbbv8v9AeJfs7sREiBX4QpJxbzpP-CLDSOyOF0fBBpZ3DrigrOBf21bzYdcFL93NpmCCgejttW-MTiLc1a7A"
			+ "IJJLSxYrk_D2VARx1oXO5Vg6bq904ev6zcIfgYHepYk2y_evZgLs_kEFmhKWQZvs1otGoqwDsY5Balpx1rs20T1X8MJDQF5VqZYxzd_U"
			+ "Qurq-rrRQvNM.eyJraWQiOiJrZXktMSJ9";
	private final static String TOKEN_2_V2_PUBLIC
			= "v2.public.eyJpc3MiOiJhdXRoLmV4YW1wbGUuY29tIiwic3ViIjoidXNlci1hdXRoIiwiYXVkIjoiaW50ZXJuYWwtc2VydmljZS5leG"
			+ "FtcGxlLmNvbSIsImV4cCI6IjIwMTgtMDEtMDFUMTc6MjM6NDQrMDA6MDAiLCJuYmYiOiIyMDE4LTAxLTAxVDE3OjE4OjQ0KzAwOjAwIi"
			+ "wiaWF0IjoiMjAxOC0wMS0wMVQxNzoxODo0NCswMDowMCIsInVzZXJJZCI6MTAwfa9DoJyOKE8e82Gh6zwdd99D5ogKl97aEzhQkRuyAd"
			+ "dwDYEMd6QNOVnlfad2P7x9nerI9JyTCiBMIbn7Fj6pWwk";
	private final static String TOKEN_2_V2_PUBLIC_WITH_FOOTER
			= "v2.public.eyJpc3MiOiJhdXRoLmV4YW1wbGUuY29tIiwic3ViIjoidXNlci1hdXRoIiwiYXVkIjoiaW50ZXJuYWwtc2VydmljZS5leG"
			+ "FtcGxlLmNvbSIsImV4cCI6IjIwMTgtMDEtMDFUMTc6MjM6NDQrMDA6MDAiLCJuYmYiOiIyMDE4LTAxLTAxVDE3OjE4OjQ0KzAwOjAwIi"
			+ "wiaWF0IjoiMjAxOC0wMS0wMVQxNzoxODo0NCswMDowMCIsInVzZXJJZCI6MTAwfYYK_N5BU15ZdZhive3TkI_NiyikpPQJHmeWKM7rZX"
			+ "a9Z2jEIczWmjt2sd_vntk6UnpW3IoZSh82xN9DFZdyKgY.eyJraWQiOiJrZXktMSJ9";
	public final static TestVector<CustomToken, Void> TV_2_V1_LOCAL = new TestVector<>(testKey(), testNonce(), TOKEN_2,
			CustomToken.class, null, TOKEN_2_V1_LOCAL);
	public final static TestVector<CustomToken, KeyId> TV_2_V1_LOCAL_WITH_FOOTER = new TestVector<>(testKey(),
			testNonce(), TOKEN_2, CustomToken.class, TOKEN_2_FOOTER, TOKEN_2_V1_LOCAL_WITH_FOOTER);
	public final static TestVector<CustomToken, Void> TV_2_V1_PUBLIC = new TestVector<>(testV1PrivateKey(),
			testV1PublicKey(), TOKEN_2, CustomToken.class, null, TOKEN_2_V1_PUBLIC);
	public final static TestVector<CustomToken, KeyId> TV_2_V1_PUBLIC_WITH_FOOTER = new TestVector<>(testV1PrivateKey(),
			testV1PublicKey(), TOKEN_2, CustomToken.class, TOKEN_2_FOOTER, TOKEN_2_V1_PUBLIC_WITH_FOOTER);
	public final static TestVector<CustomToken, Void> TV_2_V2_LOCAL = new TestVector<>(testKey(), testNonce(), TOKEN_2,
			CustomToken.class, null, TOKEN_2_V2_LOCAL);
	public final static TestVector<CustomToken, KeyId> TV_2_V2_LOCAL_WITH_FOOTER = new TestVector<>(testKey(),
			testNonce(), TOKEN_2, CustomToken.class, TOKEN_2_FOOTER, TOKEN_2_V2_LOCAL_WITH_FOOTER);
	public final static TestVector<CustomToken, Void> TV_2_V2_PUBLIC = new TestVector<>(testV2SecretKey(),
			testV2PublicKey(), TOKEN_2, CustomToken.class, null, TOKEN_2_V2_PUBLIC);
	public final static TestVector<CustomToken, KeyId> TV_2_V2_PUBLIC_WITH_FOOTER = new TestVector<>(testV2SecretKey(),
			testV2PublicKey(), TOKEN_2, CustomToken.class, TOKEN_2_FOOTER, TOKEN_2_V2_PUBLIC_WITH_FOOTER);
	
	// Minimal token, only iss and exp set.
	public final static Token TOKEN_3 = new Token()
			.setExpiration(OffsetDateTime.of(LocalDate.of(2018, 1, 1),
					LocalTime.of(17, 23, 44), ZoneOffset.UTC))
			.setIssuedAt(OffsetDateTime.of(LocalDate.of(2018, 1, 1),
					LocalTime.of(17, 18, 44), ZoneOffset.UTC));
	private final static KeyId TOKEN_3_FOOTER = new KeyId().setKeyId("key-2");
	public final static String TOKEN_3_STRING
			= "";
	private final static String TOKEN_3_V1_LOCAL
			= "v1.local.wpuFMg8zTfqtfL2wiGv9aDSg3TFH6r-viT6sbfY6Kxm3v4YM5gkmqybuFKIEXj5i-uIlW4hnZi0OXSAr1r5XEBG-p6gSuYp"
			+ "2YeD7Q-wGFPW862hH4XpI4Lityp_3toa_HZ4GsgkQLiFFw7JNxCKqOvaj-KYQ2_0Kitu7N6PiGziA0L-Yz0KpBPe9ihHc-ShrdpDelh"
			+ "E";
	private final static String TOKEN_3_V1_LOCAL_WITH_FOOTER
			= "v1.local.wpuFMg8zTfqtfL2wiGv9aDSg3TFH6r-viT6sbfY6Kxm3v4YM5gkmqybuFKIEXj5i-uIlW4hnZi0OXSAr1r5XEBG-p6gSuYp"
			+ "2YeD7Q-wGFPW862hH4XpI4Lityp_3toa_HZ4Gsgk0C7QFJRO_zyNgClnog8ItJ2HJt-5aJN8HjfyX7fPJQiebQirEwb8B4x2sD3RVoU0"
			+ ".eyJraWQiOiJrZXktMiJ9";
	private final static String TOKEN_3_V1_PUBLIC
			= "v1.public.eyJleHAiOiIyMDE4LTAxLTAxVDE3OjIzOjQ0KzAwOjAwIiwiaWF0IjoiMjAxOC0wMS0wMVQxNzoxODo0NCswMDowMCJ9l3"
			+ "B_DToj3-jCi-agwSyb2cyjZALQP43qVSDbTofKwaZRN_a9xv-XaemGIrdYt6MaVk7IqUUkvOiaCpJgjqiR4f53UbrnPLCiworEiRSxY2"
			+ "T2mUOZhf99c2BcQ6fmEkSU8aTtjgQxDLWdHzUtsaxqun-jlCQsQnX27UoIe9iiCHD5CxznR2yEGbq2UhvIZouzFOAVJKxl-G9mMPVqs1"
			+ "mmfSRGYS39rgGmljW7y964nZ3B40NkXMgD10_eK2RNg2WeTbfrKGSkyArgOoZLembGUd2F-YCms4yqyqtH7Prf7EMVLNR8ISloWHptoL"
			+ "lYoxd319ed8VMluDz-uqSzoVUBpA";
	private final static String TOKEN_3_V1_PUBLIC_WITH_FOOTER
			= "v1.public.eyJleHAiOiIyMDE4LTAxLTAxVDE3OjIzOjQ0KzAwOjAwIiwiaWF0IjoiMjAxOC0wMS0wMVQxNzoxODo0NCswMDowMCJ9eI"
			+ "lEjS5-0-Kl0lHBLrGdFI59wEVkoqLalmSqcJxrWAC6vW5OoN8KPCUBR73P689i30IDsNc7gDNyTTiKJJPefwoPjhCAkXV5Wa_UN40sUG"
			+ "LUGw_jTd9BVZ5hbSsRP_zljm7RGjnh32mOjQZ4I3q-RPbsiL7qoW5SD8pSkjC_-DTsDtMO7yie3YALPnu7X_-M8QZYN0akkwQZ2I6iVC"
			+ "IMWT5nrCjsYtOIzK7ZYrLgEpksuYjCdtk0ZjLfhbiwsBL2L9jKj2VHqNeby9veNmQruWqB48dbczq11QbXIPcAABecWGa7Ayn1-u4XDE"
			+ "lt4IoKDBIt2GrA0lB67fKn4pAI-g.eyJraWQiOiJrZXktMiJ9";
	private final static String TOKEN_3_V2_LOCAL
			= "v2.local.s_IagepBKqxJs4l6e47StVzIDI4P_b2BX1Wqtr-IyyhkUrguLTQT2p7X4bWATXdWQazJtwOQnGm7GHRX90UZFtH505NP0kd"
			+ "5SuE_cyfeSOzFGgG4aFPPxHaQXZeZGPmSKMaF1wsW5jfraa9H5Q";
	private final static String TOKEN_3_V2_LOCAL_WITH_FOOTER
			= "v2.local.s_IagepBKqxJs4l6e47StVzIDI4P_b2BX1Wqtr-IyyhkUrguLTQT2p7X4bWATXdWQazJtwOQnGm7GHRX90UZFtH505NP0kd"
			+ "5SuE_cyfeSOzFGgG4aFPPxHaQXZeZNyYXhSZz9IhSwoIl7jQamw.eyJraWQiOiJrZXktMiJ9";
	private final static String TOKEN_3_V2_PUBLIC
			= "v2.public.eyJleHAiOiIyMDE4LTAxLTAxVDE3OjIzOjQ0KzAwOjAwIiwiaWF0IjoiMjAxOC0wMS0wMVQxNzoxODo0NCswMDowMCJ9du"
			+ "vMylS5Zt48Mlu9206iswmp3pNarZya1JHuM4sI8yIOSlB6_LtukHaDjMCfN1jzKqp13jyoVqcIHm1H7RyiBw";
	private final static String TOKEN_3_V2_PUBLIC_WITH_FOOTER
			= "v2.public.eyJleHAiOiIyMDE4LTAxLTAxVDE3OjIzOjQ0KzAwOjAwIiwiaWF0IjoiMjAxOC0wMS0wMVQxNzoxODo0NCswMDowMCJ9gc"
			+ "TyYa__QR6HuqU5Kcbl1cmXZDCEGdFy2xCO4MFnP8teHUfLs_vcY3Dfq3KjgfSAYXxEktCwpxhk3eQwg14yCQ.eyJraWQiOiJrZXktMiJ"
			+ "9";
	public final static TestVector<Token, Void> TV_3_V1_LOCAL = new TestVector<>(testKey(), testNonce(), TOKEN_3,
			Token.class, null, TOKEN_3_V1_LOCAL);
	public final static TestVector<Token, KeyId> TV_3_V1_LOCAL_WITH_FOOTER = new TestVector<>(testKey(), testNonce(),
			TOKEN_3, Token.class, TOKEN_3_FOOTER, TOKEN_3_V1_LOCAL_WITH_FOOTER);
	public final static TestVector<Token, Void> TV_3_V1_PUBLIC = new TestVector<>(testV1PrivateKey(), testV1PublicKey(),
			TOKEN_3, Token.class, null, TOKEN_3_V1_PUBLIC);
	public final static TestVector<Token, KeyId> TV_3_V1_PUBLIC_WITH_FOOTER = new TestVector<>(testV1PrivateKey(),
			testV1PublicKey(), TOKEN_3, Token.class, TOKEN_3_FOOTER, TOKEN_3_V1_PUBLIC_WITH_FOOTER);
	public final static TestVector<Token, Void> TV_3_V2_LOCAL = new TestVector<>(testKey(), testNonce(), TOKEN_3,
			Token.class, null, TOKEN_3_V2_LOCAL);
	public final static TestVector<Token, KeyId> TV_3_V2_LOCAL_WITH_FOOTER = new TestVector<>(testKey(), testNonce(),
			TOKEN_3, Token.class, TOKEN_3_FOOTER, TOKEN_3_V2_LOCAL_WITH_FOOTER);
	public final static TestVector<Token, Void> TV_3_V2_PUBLIC = new TestVector<>(testV2SecretKey(), testV2PublicKey(),
			TOKEN_3, Token.class, null, TOKEN_3_V2_PUBLIC);
	public final static TestVector<Token, KeyId> TV_3_V2_PUBLIC_WITH_FOOTER = new TestVector<>(testV2SecretKey(),
			testV2PublicKey(), TOKEN_3, Token.class, TOKEN_3_FOOTER, TOKEN_3_V2_PUBLIC_WITH_FOOTER);

	// Empty token
	public final static Token TOKEN_4 = new Token();
	private final static KeyId TOKEN_4_FOOTER = new KeyId().setKeyId("key-1");
	private final static String TOKEN_4_V1_LOCAL
			= "v1.local.--TLHXMWiZYc9aTQma_NiYLMqRDN69tSdiqpU6V-dsNeDhIDqBxyneNGy4bSvNHeNkca_39GwyZdxUx0sOQ8EOQUEAhSrnd"
			+ "EuX2JDwQFsWUUMw";
	private final static String TOKEN_4_V1_LOCAL_WITH_FOOTER
			= "v1.local.--TLHXMWiZYc9aTQma_NiYLMqRDN69tSdiqpU6V-dsNeDhph1Ij5pSdhLuRhJlpQSPuQh4U_fRBFAmZU5ZhfhTnBsrHvR-q"
			+ "8Gs8GnoUO1hr9lA.eyJraWQiOiJrZXktMSJ9";
	private final static String TOKEN_4_V1_PUBLIC
			= "v1.public.e30hJtxCLP0n-WZyvdSqYApXpdaTVFNoYiFRy-GLDM7tSTQM5rl-xCRVyCAgF1xZ1a-2EzVSkZongX2hE9e55VowPse8jI"
			+ "GvT9oYNx0Xmu5OyNMBCV1LpO45lDqi5Ulw4wq-UEmlewq4cf8ERVI1UbfrysPC8Ie-6sh1v77sbEajzlOydJMq2KB4qWG-W0qFL0nJ6p"
			+ "4hNRHPQajokFgdNsCdJW9fZ9JGSXPkkRnBX8hl4qm_prKVMLsx-9YwpLnEagW7ZM73RdaEY65aOCL5uuUGCkhLcOTBywdknEv3Vytdpg"
			+ "cRKpaIzvpE_KMwuK-UnSeNhYhruXbbeChE9qPIfzMh";
	private final static String TOKEN_4_V1_PUBLIC_WITH_FOOTER
			= "v1.public.e31S5itjTRTcxHALKCdpUxyMNr15pEMxZZiDYiulJStAa_n7MtEJbqddYHsuZyGz7PlpYuTYfmiH_dziAj7FPwQ4d_tTcS"
			+ "sTq8cT6IUpA5et7W55iVSUoGUoRSBMEM5CepNq4yc0KR4ryvPv2KQ2RQHF9BnCbH8LyHyiTGO_6UHRHeLZrlaCUyJG3AUrFJPQ6Oehbe"
			+ "6vMBTfHqPL-f6j4ldvS7ki9gHL_iN3EMoy2-v6bNkRpoYDLATZbwsje1aR7Vhk2v_Aiop2pAoqO8VWs6U4KVSN5gukUW2-6h97btmdfM"
			+ "5DZkpYhQVHGdqsOFCBB5txZSNjDtpfCo-oGAHkBIA2.eyJraWQiOiJrZXktMSJ9";
	private final static String TOKEN_4_V2_LOCAL
			= "v2.local.iX9JhHZ4_OW6GHqAbSPP23VAGg5RnEeuGgVksnbXKVHrlWaTU18JRP9I";
	private final static String TOKEN_4_V2_LOCAL_WITH_FOOTER
			= "v2.local.iX9JhHZ4_OW6GHqAbSPP23VAGg5RnEeuGgWaTY-bgw1FO-EuJhIaUJp2.eyJraWQiOiJrZXktMSJ9";
	private final static String TOKEN_4_V2_PUBLIC
			= "v2.public.e31M63YrD2PTNGHzBHHeLhYooCXgT2KxLBmPdFSlLr-7poFIEaxqGD7w2XCwcdJkSjagz2o7Gtwh9VYTRHGtYMEM";
	private final static String TOKEN_4_V2_PUBLIC_WITH_FOOTER
			= "v2.public.e30RItbv4bN4XIzyLFapaMll5aOnuqcmttzAH4-pFf8vHrK8COU0EeGwlt-1tfR3OkUxTyoQdlE2dlOtbLxlbrEO.eyJra"
			+ "WQiOiJrZXktMSJ9";
	public final static TestVector<Token, Void> TV_4_V1_LOCAL = new TestVector<>(testKey(), testNonce(), TOKEN_4,
			Token.class, null, TOKEN_4_V1_LOCAL);
	public final static TestVector<Token, KeyId> TV_4_V1_LOCAL_WITH_FOOTER = new TestVector<>(testKey(), testNonce(),
			TOKEN_4, Token.class, TOKEN_4_FOOTER, TOKEN_4_V1_LOCAL_WITH_FOOTER);
	public final static TestVector<Token, Void> TV_4_V1_PUBLIC = new TestVector<>(testV1PrivateKey(), testV1PublicKey(),
			TOKEN_4, Token.class, null, TOKEN_4_V1_PUBLIC);
	public final static TestVector<Token, KeyId> TV_4_V1_PUBLIC_WITH_FOOTER = new TestVector<>(testV1PrivateKey(),
			testV1PublicKey(), TOKEN_4, Token.class, TOKEN_4_FOOTER, TOKEN_4_V1_PUBLIC_WITH_FOOTER);
	public final static TestVector<Token, Void> TV_4_V2_LOCAL = new TestVector<>(testKey(), testNonce(), TOKEN_4,
			Token.class, null, TOKEN_4_V2_LOCAL);
	public final static TestVector<Token, KeyId> TV_4_V2_LOCAL_WITH_FOOTER = new TestVector<>(testKey(), testNonce(),
			TOKEN_4, Token.class, TOKEN_4_FOOTER, TOKEN_4_V2_LOCAL_WITH_FOOTER);
	public final static TestVector<Token, Void> TV_4_V2_PUBLIC = new TestVector<>(testV2SecretKey(), testV2PublicKey(),
			TOKEN_4, Token.class, null, TOKEN_4_V2_PUBLIC);
	public final static TestVector<Token, KeyId> TV_4_V2_PUBLIC_WITH_FOOTER = new TestVector<>(testV2SecretKey(),
			testV2PublicKey(), TOKEN_4, Token.class, TOKEN_4_FOOTER, TOKEN_4_V2_PUBLIC_WITH_FOOTER);

	public static byte[] testKey() {
		return ByteArrayTestUtil.convertToByteArray(TEST_KEY);
	}

	private static byte[] testNonce() {
		return ByteArrayTestUtil.convertToByteArray(TEST_NONCE);
	}

	public static byte[] testV1PrivateKey() {
		return ByteArrayTestUtil.convertToByteArray(TEST_RSA_PRIVATE_KEY);
	}

	public static byte[] testV1PublicKey() {
		return ByteArrayTestUtil.convertToByteArray(TEST_RSA_PUBLIC_KEY);
	}

	public static byte[] testV2SecretKey() {
		return ByteArrayTestUtil.convertToByteArray(TEST_SK);
	}

	public static byte[] testV2PublicKey() {
		return ByteArrayTestUtil.convertToByteArray(TEST_PK);
	}
}