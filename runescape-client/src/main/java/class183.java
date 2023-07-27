import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class183 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 331775757
	)
	public static int field1886;
	@ObfuscatedName("ht")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = 904282112
	)
	static int field1890;
	@ObfuscatedName("ar")
	public short[] field1888;
	@ObfuscatedName("am")
	public short[] field1891;

	public class183(int var1) {
		ItemComposition var2 = class125.ItemComposition_get(var1); // L: 12
		if (var2.method3989()) { // L: 13
			this.field1888 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1888, 0, this.field1888.length); // L: 15
		}

		if (var2.method3982()) { // L: 17
			this.field1891 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1891, 0, this.field1891.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1206238469"
	)
	public static void method3575(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			var0 = var0 + "-" + var1; // L: 41
		}

		JagexCache.field1840 = var4; // L: 43
		NameableContainer.cacheGamebuild = var3; // L: 44

		try {
			class424.field4617 = System.getProperty("os.name"); // L: 46
		} catch (Exception var36) { // L: 48
			class424.field4617 = "Unknown"; // L: 49
		}

		CollisionMap.field2347 = class424.field4617.toLowerCase(); // L: 51
		Bounds.userHomeDirectory = null; // L: 52

		try {
			Bounds.userHomeDirectory = System.getProperty("jagex.userhome"); // L: 54
		} catch (Exception var35) { // L: 56
		}

		if (Bounds.userHomeDirectory == null) { // L: 57
			try {
				Bounds.userHomeDirectory = System.getProperty("user.home"); // L: 58
			} catch (Exception var34) { // L: 60
			}
		}

		if (Bounds.userHomeDirectory != null) { // L: 61
			Bounds.userHomeDirectory = Bounds.userHomeDirectory + "/";
		}

		try {
			if (CollisionMap.field2347.startsWith("win")) { // L: 63
				if (Bounds.userHomeDirectory == null) { // L: 64
					Bounds.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (Bounds.userHomeDirectory == null) { // L: 67
				Bounds.userHomeDirectory = System.getenv("HOME");
			}

			if (Bounds.userHomeDirectory != null) { // L: 69
				Bounds.userHomeDirectory = Bounds.userHomeDirectory + "/";
			}
		} catch (Exception var33) { // L: 71
		}

		if (Bounds.userHomeDirectory == null) { // L: 72
			Bounds.userHomeDirectory = "~/";
		}

		class157.field1745 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Bounds.userHomeDirectory, "/tmp/", ""}; // L: 73
		ByteArrayPool.field4541 = new String[]{".jagex_cache_" + NameableContainer.cacheGamebuild, ".file_store_" + NameableContainer.cacheGamebuild}; // L: 74
		int var19 = 0;

		label301:
		while (var19 < 4) {
			String var7 = var19 == 0 ? "" : "" + var19; // L: 78
			class158.field1748 = new File(Bounds.userHomeDirectory, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat"); // L: 79
			String var8 = null; // L: 80
			String var9 = null; // L: 81
			boolean var10 = false; // L: 82
			Buffer var12;
			int var13;
			int var15;
			File var41;
			if (class158.field1748.exists()) { // L: 83
				try {
					AccessFile var11 = new AccessFile(class158.field1748, "rw", 10000L); // L: 86

					for (var12 = new Buffer((int)var11.length()); var12.offset < var12.array.length; var12.offset += var13) { // L: 87 88 91
						var13 = var11.read(var12.array, var12.offset, var12.array.length - var12.offset); // L: 89
						if (var13 == -1) { // L: 90
							throw new IOException();
						}
					}

					var12.offset = 0; // L: 93
					var13 = var12.readUnsignedByte(); // L: 94
					if (var13 < 1 || var13 > 3) { // L: 95
						throw new IOException("" + var13);
					}

					int var14 = 0; // L: 96
					if (var13 > 1) { // L: 97
						var14 = var12.readUnsignedByte();
					}

					if (var13 <= 2) { // L: 98
						var8 = var12.readStringCp1252NullCircumfixed(); // L: 99
						if (var14 == 1) { // L: 100
							var9 = var12.readStringCp1252NullCircumfixed();
						}
					} else {
						var8 = var12.readCESU8(); // L: 103
						if (var14 == 1) { // L: 104
							var9 = var12.readCESU8();
						}
					}

					var11.close(); // L: 106
				} catch (IOException var38) { // L: 108
					var38.printStackTrace(); // L: 109
				}

				if (var8 != null) { // L: 111
					var41 = new File(var8); // L: 112
					if (!var41.exists()) { // L: 113
						var8 = null; // L: 114
					}
				}

				if (var8 != null) { // L: 117
					var41 = new File(var8, "test.dat"); // L: 118

					boolean var43;
					try {
						RandomAccessFile var20 = new RandomAccessFile(var41, "rw"); // L: 122
						var15 = var20.read(); // L: 123
						var20.seek(0L); // L: 124
						var20.write(var15); // L: 125
						var20.seek(0L); // L: 126
						var20.close(); // L: 127
						var41.delete(); // L: 128
						var43 = true; // L: 129
					} catch (Exception var32) { // L: 131
						var43 = false; // L: 132
					}

					if (!var43) { // L: 135
						var8 = null; // L: 136
					}
				}
			}

			if (var8 == null && var19 == 0) { // L: 140
				label276:
				for (int var21 = 0; var21 < ByteArrayPool.field4541.length; ++var21) { // L: 141
					for (int var22 = 0; var22 < class157.field1745.length; ++var22) { // L: 142
						File var23 = new File(class157.field1745[var22] + ByteArrayPool.field4541[var21] + File.separatorChar + var0 + File.separatorChar); // L: 143
						if (var23.exists()) { // L: 144
							File var24 = new File(var23, "test.dat"); // L: 146

							boolean var45;
							try {
								RandomAccessFile var16 = new RandomAccessFile(var24, "rw"); // L: 149
								int var17 = var16.read(); // L: 150
								var16.seek(0L); // L: 151
								var16.write(var17); // L: 152
								var16.seek(0L); // L: 153
								var16.close(); // L: 154
								var24.delete(); // L: 155
								var45 = true; // L: 156
							} catch (Exception var31) { // L: 158
								var45 = false; // L: 159
							}

							if (var45) { // L: 162
								var8 = var23.toString(); // L: 163
								var10 = true; // L: 164
								break label276; // L: 165
							}
						}
					}
				}
			}

			if (var8 == null) { // L: 171
				var8 = Bounds.userHomeDirectory + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar; // L: 172
				var10 = true; // L: 173
			}

			File var40;
			if (var9 != null) { // L: 175
				var40 = new File(var9); // L: 176
				var41 = new File(var8); // L: 177

				try {
					File[] var50 = var40.listFiles(); // L: 179
					File[] var47 = var50; // L: 181

					for (var15 = 0; var15 < var47.length; ++var15) { // L: 182
						File var46 = var47[var15]; // L: 183
						File var25 = new File(var41, var46.getName()); // L: 185
						boolean var18 = var46.renameTo(var25); // L: 186
						if (!var18) { // L: 187
							throw new IOException();
						}
					}
				} catch (Exception var37) { // L: 192
					var37.printStackTrace(); // L: 193
				}

				var10 = true; // L: 195
			}

			if (var10) { // L: 197
				var40 = new File(var8); // L: 198
				var12 = null; // L: 199

				try {
					AccessFile var51 = new AccessFile(class158.field1748, "rw", 10000L); // L: 203
					Buffer var48 = new Buffer(500); // L: 204
					var48.writeByte(3); // L: 205
					var48.writeByte(var12 != null ? 1 : 0); // L: 206
					var48.writeCESU8(var40.getPath()); // L: 207
					if (var12 != null) { // L: 208
						var48.writeCESU8("");
					}

					var51.write(var48.array, 0, var48.offset); // L: 209
					var51.close(); // L: 210
				} catch (IOException var30) { // L: 212
					var30.printStackTrace(); // L: 213
				}
			}

			File var6 = new File(var8); // L: 217
			JagexCache.cacheDir = var6; // L: 219
			if (!JagexCache.cacheDir.exists()) { // L: 220
				JagexCache.cacheDir.mkdirs();
			}

			File[] var39 = JagexCache.cacheDir.listFiles(); // L: 221
			if (var39 != null) { // L: 222
				File[] var42 = var39; // L: 224

				for (int var26 = 0; var26 < var42.length; ++var26) { // L: 225
					File var27 = var42[var26]; // L: 226

					boolean var49;
					try {
						RandomAccessFile var44 = new RandomAccessFile(var27, "rw"); // L: 231
						var13 = var44.read(); // L: 232
						var44.seek(0L); // L: 233
						var44.write(var13); // L: 234
						var44.seek(0L); // L: 235
						var44.close(); // L: 236
						var49 = true; // L: 238
					} catch (Exception var29) { // L: 240
						var49 = false; // L: 241
					}

					if (!var49) { // L: 244
						++var19; // L: 75
						continue label301;
					}
				}
			}
			break;
		}

		File var5 = JagexCache.cacheDir; // L: 251
		FileSystem.FileSystem_cacheDir = var5; // L: 253
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 254
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 255
			Nameable.method7972(); // L: 257
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class7.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 258
			JagexCache.field1836 = new BufferedFile(new AccessFile(class7.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 259
			class302.JagexCache_idxFiles = new BufferedFile[JagexCache.field1840]; // L: 260

			for (int var28 = 0; var28 < JagexCache.field1840; ++var28) { // L: 261
				class302.JagexCache_idxFiles[var28] = new BufferedFile(new AccessFile(class7.getFile("main_file_cache.idx" + var28), "rw", 1048576L), 6000, 0); // L: 262
			}

		}
	} // L: 264

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltc;IB)Z",
		garbageValue = "-18"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 369
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 370
			if (var0.readBits(1) != 0) { // L: 371
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 372
			var4 = var0.readBits(13); // L: 373
			boolean var12 = var0.readBits(1) == 1; // L: 374
			if (var12) { // L: 375
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 376
				throw new RuntimeException(); // L: 377
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 379
				var11.index = var1; // L: 380
				if (Players.field1360[var1] != null) { // L: 381
					var11.read(Players.field1360[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 382
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 383
				var7 = Players.Players_regions[var1]; // L: 384
				var8 = var7 >> 28; // L: 385
				var9 = var7 >> 14 & 255; // L: 386
				var10 = var7 & 255; // L: 387
				var11.pathTraversed[0] = Players.field1363[var1]; // L: 388
				var11.plane = (byte)var8; // L: 389
				var11.resetPath((var9 << 13) + var3 - AbstractArchive.baseX * 64, (var10 << 13) + var4 - class148.baseY * 64); // L: 390
				var11.field1118 = false; // L: 391
				return true; // L: 392
			}
		} else if (var2 == 1) { // L: 394
			var3 = var0.readBits(2); // L: 395
			var4 = Players.Players_regions[var1]; // L: 396
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 397
			return false; // L: 398
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 400
				var3 = var0.readBits(5); // L: 401
				var4 = var3 >> 3; // L: 402
				var5 = var3 & 7; // L: 403
				var6 = Players.Players_regions[var1]; // L: 404
				var7 = (var6 >> 28) + var4 & 3; // L: 405
				var8 = var6 >> 14 & 255; // L: 406
				var9 = var6 & 255; // L: 407
				if (var5 == 0) { // L: 408
					--var8; // L: 409
					--var9; // L: 410
				}

				if (var5 == 1) { // L: 412
					--var9;
				}

				if (var5 == 2) { // L: 413
					++var8; // L: 414
					--var9; // L: 415
				}

				if (var5 == 3) { // L: 417
					--var8;
				}

				if (var5 == 4) { // L: 418
					++var8;
				}

				if (var5 == 5) { // L: 419
					--var8; // L: 420
					++var9; // L: 421
				}

				if (var5 == 6) { // L: 423
					++var9;
				}

				if (var5 == 7) { // L: 424
					++var8; // L: 425
					++var9; // L: 426
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 428
				return false; // L: 429
			} else {
				var3 = var0.readBits(18); // L: 431
				var4 = var3 >> 16; // L: 432
				var5 = var3 >> 8 & 255; // L: 433
				var6 = var3 & 255; // L: 434
				var7 = Players.Players_regions[var1]; // L: 435
				var8 = (var7 >> 28) + var4 & 3; // L: 436
				var9 = var5 + (var7 >> 14) & 255; // L: 437
				var10 = var6 + var7 & 255; // L: 438
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 439
				return false; // L: 440
			}
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1851987184"
	)
	static final void method3576(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 8487
			if (Client.isLowDetail && var0 != class36.Client_plane) { // L: 8488
				return;
			}

			long var8 = 0L; // L: 8489
			boolean var10 = true; // L: 8490
			boolean var11 = false; // L: 8491
			boolean var12 = false; // L: 8492
			if (var1 == 0) { // L: 8493
				var8 = UserComparator5.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 8494
				var8 = UserComparator5.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 8495
				var8 = UserComparator5.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 8496
				var8 = UserComparator5.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var13;
			if (var8 != 0L) { // L: 8497
				var13 = UserComparator5.scene.getObjectFlags(var0, var2, var3, var8); // L: 8498
				int var40 = class458.Entity_unpackID(var8); // L: 8499
				int var41 = var13 & 31; // L: 8500
				int var42 = var13 >> 6 & 3; // L: 8501
				ObjectComposition var14;
				if (var1 == 0) { // L: 8502
					UserComparator5.scene.method4576(var0, var2, var3); // L: 8503
					var14 = class90.getObjectDefinition(var40); // L: 8504
					if (var14.interactType != 0) { // L: 8505
						Client.collisionMaps[var0].method4202(var2, var3, var41, var42, var14.boolean1);
					}
				}

				if (var1 == 1) { // L: 8507
					UserComparator5.scene.method4674(var0, var2, var3);
				}

				if (var1 == 2) { // L: 8508
					UserComparator5.scene.removeGameObject(var0, var2, var3); // L: 8509
					var14 = class90.getObjectDefinition(var40); // L: 8510
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) { // L: 8511
						return;
					}

					if (var14.interactType != 0) { // L: 8512
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var42, var14.boolean1);
					}
				}

				if (var1 == 3) { // L: 8514
					UserComparator5.scene.method4579(var0, var2, var3); // L: 8515
					var14 = class90.getObjectDefinition(var40); // L: 8516
					if (var14.interactType == 1) { // L: 8517
						Client.collisionMaps[var0].method4194(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8520
				var13 = var0; // L: 8521
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8522
					var13 = var0 + 1;
				}

				Scene var43 = UserComparator5.scene; // L: 8523
				CollisionMap var15 = Client.collisionMaps[var0]; // L: 8524
				ObjectComposition var16 = class90.getObjectDefinition(var4); // L: 8526
				int var17 = var7 >= 0 ? var7 : var16.animationId; // L: 8527
				int var18;
				int var19;
				if (var5 != 1 && var5 != 3) { // L: 8530
					var18 = var16.sizeX; // L: 8535
					var19 = var16.sizeY; // L: 8536
				} else {
					var18 = var16.sizeY; // L: 8531
					var19 = var16.sizeX; // L: 8532
				}

				int var20;
				int var21;
				if (var18 + var2 <= 104) { // L: 8542
					var20 = (var18 >> 1) + var2; // L: 8543
					var21 = var2 + (var18 + 1 >> 1); // L: 8544
				} else {
					var20 = var2; // L: 8547
					var21 = var2 + 1; // L: 8548
				}

				int var22;
				int var23;
				if (var3 + var19 <= 104) { // L: 8550
					var22 = var3 + (var19 >> 1); // L: 8551
					var23 = var3 + (var19 + 1 >> 1); // L: 8552
				} else {
					var22 = var3; // L: 8555
					var23 = var3 + 1; // L: 8556
				}

				int[][] var24 = Tiles.Tiles_heights[var13]; // L: 8558
				int var25 = var24[var21][var23] + var24[var20][var22] + var24[var21][var22] + var24[var20][var23] >> 2; // L: 8559
				int var26 = (var2 << 7) + (var18 << 6); // L: 8560
				int var27 = (var3 << 7) + (var19 << 6); // L: 8561
				long var28 = BufferedNetSocket.calculateTag(var2, var3, 2, var16.int1 == 0, var4); // L: 8562
				int var30 = (var5 << 6) + var6; // L: 8563
				if (var16.int3 == 1) { // L: 8564
					var30 += 256;
				}

				Object var38;
				if (var6 == 22) { // L: 8565
					if (var17 == -1 && var16.transforms == null) { // L: 8567
						var38 = var16.getModel(22, var5, var24, var26, var25, var27);
					} else {
						var38 = new DynamicObject(var4, 22, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8568
					}

					var43.newGroundObject(var0, var2, var3, var25, (Renderable)var38, var28, var30); // L: 8569
					if (var16.interactType == 1) { // L: 8570
						var15.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 8573
					if (var6 >= 12) { // L: 8581
						if (var17 == -1 && var16.transforms == null) { // L: 8583
							var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8584
						}

						var43.method4569(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30); // L: 8585
						if (var16.interactType != 0) { // L: 8586
							var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
						}
					} else if (var6 == 0) { // L: 8589
						if (var17 == -1 && var16.transforms == null) { // L: 8591
							var38 = var16.getModel(0, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, 0, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8592
						}

						var43.newWallObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1027[var5], 0, var28, var30); // L: 8593
						if (var16.interactType != 0) { // L: 8594
							var15.method4191(var2, var3, var6, var5, var16.boolean1);
						}
					} else if (var6 == 1) { // L: 8597
						if (var17 == -1 && var16.transforms == null) { // L: 8599
							var38 = var16.getModel(1, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, 1, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8600
						}

						var43.newWallObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1028[var5], 0, var28, var30); // L: 8601
						if (var16.interactType != 0) { // L: 8602
							var15.method4191(var2, var3, var6, var5, var16.boolean1);
						}
					} else {
						int var31;
						if (var6 == 2) { // L: 8605
							var31 = var5 + 1 & 3; // L: 8606
							Object var33;
							Object var39;
							if (var17 == -1 && var16.transforms == null) { // L: 8609
								var39 = var16.getModel(2, var5 + 4, var24, var26, var25, var27); // L: 8610
								var33 = var16.getModel(2, var31, var24, var26, var25, var27); // L: 8611
							} else {
								var39 = new DynamicObject(var4, 2, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8614
								var33 = new DynamicObject(var4, 2, var31, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8615
							}

							var43.newWallObject(var0, var2, var3, var25, (Renderable)var39, (Renderable)var33, Tiles.field1027[var5], Tiles.field1027[var31], var28, var30); // L: 8617
							if (var16.interactType != 0) { // L: 8618
								var15.method4191(var2, var3, var6, var5, var16.boolean1);
							}
						} else if (var6 == 3) { // L: 8621
							if (var17 == -1 && var16.transforms == null) { // L: 8623
								var38 = var16.getModel(3, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, 3, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8624
							}

							var43.newWallObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1028[var5], 0, var28, var30); // L: 8625
							if (var16.interactType != 0) { // L: 8626
								var15.method4191(var2, var3, var6, var5, var16.boolean1);
							}
						} else if (var6 == 9) { // L: 8629
							if (var17 == -1 && var16.transforms == null) { // L: 8631
								var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8632
							}

							var43.method4569(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30); // L: 8633
							if (var16.interactType != 0) { // L: 8634
								var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
							}
						} else if (var6 == 4) { // L: 8637
							if (var17 == -1 && var16.transforms == null) { // L: 8639
								var38 = var16.getModel(4, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8640
							}

							var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1027[var5], 0, 0, 0, var28, var30); // L: 8641
						} else {
							long var32;
							Object var34;
							if (var6 == 5) { // L: 8644
								var31 = 16; // L: 8645
								var32 = var43.getWallObjectTag(var0, var2, var3); // L: 8646
								if (0L != var32) { // L: 8647
									var31 = class90.getObjectDefinition(class458.Entity_unpackID(var32)).int2;
								}

								if (var17 == -1 && var16.transforms == null) { // L: 8649
									var34 = var16.getModel(4, var5, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8650
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, Tiles.field1027[var5], 0, var31 * Tiles.field1037[var5], var31 * Tiles.field1034[var5], var28, var30); // L: 8651
							} else if (var6 == 6) { // L: 8654
								var31 = 8; // L: 8655
								var32 = var43.getWallObjectTag(var0, var2, var3); // L: 8656
								if (0L != var32) { // L: 8657
									var31 = class90.getObjectDefinition(class458.Entity_unpackID(var32)).int2 / 2;
								}

								if (var17 == -1 && var16.transforms == null) { // L: 8659
									var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8660
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, 256, var5, var31 * Tiles.field1031[var5], var31 * Tiles.field1032[var5], var28, var30); // L: 8661
							} else if (var6 == 7) { // L: 8664
								int var37 = var5 + 2 & 3; // L: 8666
								if (var17 == -1 && var16.transforms == null) { // L: 8667
									var38 = var16.getModel(4, var37 + 4, var24, var26, var25, var27);
								} else {
									var38 = new DynamicObject(var4, 4, var37 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8668
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, 256, var37, 0, 0, var28, var30); // L: 8669
							} else if (var6 == 8) { // L: 8672
								var31 = 8; // L: 8673
								var32 = var43.getWallObjectTag(var0, var2, var3); // L: 8674
								if (var32 != 0L) { // L: 8675
									var31 = class90.getObjectDefinition(class458.Entity_unpackID(var32)).int2 / 2;
								}

								int var36 = var5 + 2 & 3; // L: 8678
								Object var35;
								if (var17 == -1 && var16.transforms == null) { // L: 8679
									var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27); // L: 8680
									var35 = var16.getModel(4, var36 + 4, var24, var26, var25, var27); // L: 8681
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8684
									var35 = new DynamicObject(var4, 4, var36 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8685
								}

								var43.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)var35, 256, var5, var31 * Tiles.field1031[var5], var31 * Tiles.field1032[var5], var28, var30); // L: 8687
							}
						}
					}
				} else {
					if (var17 == -1 && var16.transforms == null) { // L: 8575
						var38 = var16.getModel(10, var5, var24, var26, var25, var27);
					} else {
						var38 = new DynamicObject(var4, 10, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null); // L: 8576
					}

					if (var38 != null) { // L: 8577
						var43.method4569(var0, var2, var3, var25, var18, var19, (Renderable)var38, var6 == 11 ? 256 : 0, var28, var30);
					}

					if (var16.interactType != 0) { // L: 8578
						var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
					}
				}
			}
		}

	} // L: 8692
}
