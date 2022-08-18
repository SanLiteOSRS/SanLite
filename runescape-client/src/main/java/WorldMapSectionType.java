import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(3, (byte)0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(2, (byte)1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(0, (byte)2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(1, (byte)3);

	@ObfuscatedName("l")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	static Bounds field2781;
	@ObfuscatedName("fb")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1437983207
	)
	@Export("type")
	final int type;
	@ObfuscatedName("w")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 21
		this.id = var4; // L: 22
	} // L: 23

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1790946346"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 27
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhg;",
		garbageValue = "-492719905"
	)
	static WorldMapSectionType[] method4928() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE3}; // L: 17
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-500537850"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 177
			if (KeyHandler.field150 == KeyHandler.field148) { // L: 178
				return false;
			} else {
				SequenceDefinition.field2176 = KeyHandler.field128[KeyHandler.field148]; // L: 179
				Clock.field1797 = KeyHandler.field136[KeyHandler.field148]; // L: 180
				KeyHandler.field148 = KeyHandler.field148 + 1 & 127; // L: 181
				return true; // L: 182
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqy;II)Z",
		garbageValue = "1961067812"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 370
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 371
			if (var0.readBits(1) != 0) { // L: 372
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 373
			var4 = var0.readBits(13); // L: 374
			boolean var12 = var0.readBits(1) == 1; // L: 375
			if (var12) { // L: 376
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 377
				throw new RuntimeException(); // L: 378
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 380
				var11.index = var1; // L: 381
				if (Players.field1295[var1] != null) { // L: 382
					var11.read(Players.field1295[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 383
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 384
				var7 = Players.Players_regions[var1]; // L: 385
				var8 = var7 >> 28; // L: 386
				var9 = var7 >> 14 & 255; // L: 387
				var10 = var7 & 255; // L: 388
				var11.pathTraversed[0] = Players.field1294[var1]; // L: 389
				var11.plane = (byte)var8; // L: 390
				var11.resetPath((var9 << 13) + var3 - class300.baseX * 64, (var10 << 13) + var4 - Message.baseY * 64); // L: 391
				var11.field1111 = false; // L: 392
				return true; // L: 393
			}
		} else if (var2 == 1) { // L: 395
			var3 = var0.readBits(2); // L: 396
			var4 = Players.Players_regions[var1]; // L: 397
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 398
			return false; // L: 399
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 401
				var3 = var0.readBits(5); // L: 402
				var4 = var3 >> 3; // L: 403
				var5 = var3 & 7; // L: 404
				var6 = Players.Players_regions[var1]; // L: 405
				var7 = (var6 >> 28) + var4 & 3; // L: 406
				var8 = var6 >> 14 & 255; // L: 407
				var9 = var6 & 255; // L: 408
				if (var5 == 0) { // L: 409
					--var8; // L: 410
					--var9; // L: 411
				}

				if (var5 == 1) { // L: 413
					--var9;
				}

				if (var5 == 2) { // L: 414
					++var8; // L: 415
					--var9; // L: 416
				}

				if (var5 == 3) { // L: 418
					--var8;
				}

				if (var5 == 4) { // L: 419
					++var8;
				}

				if (var5 == 5) { // L: 420
					--var8; // L: 421
					++var9; // L: 422
				}

				if (var5 == 6) { // L: 424
					++var9;
				}

				if (var5 == 7) { // L: 425
					++var8; // L: 426
					++var9; // L: 427
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 429
				return false; // L: 430
			} else {
				var3 = var0.readBits(18); // L: 432
				var4 = var3 >> 16; // L: 433
				var5 = var3 >> 8 & 255; // L: 434
				var6 = var3 & 255; // L: 435
				var7 = Players.Players_regions[var1]; // L: 436
				var8 = (var7 >> 28) + var4 & 3; // L: 437
				var9 = var5 + (var7 >> 14) & 255; // L: 438
				var10 = var6 + var7 & 255; // L: 439
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 440
				return false; // L: 441
			}
		}
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-91789193"
	)
	static final void method4927(int var0, int var1) {
		if (var0 < 128) { // L: 3909
			var0 = 128;
		}

		if (var0 > 383) { // L: 3910
			var0 = 383;
		}

		if (UserComparator9.cameraPitch < var0) { // L: 3911
			UserComparator9.cameraPitch = (var0 - UserComparator9.cameraPitch) * ScriptFrame.field459 / 1000 + UserComparator9.cameraPitch + class83.field1082; // L: 3912
			if (UserComparator9.cameraPitch > var0) { // L: 3913
				UserComparator9.cameraPitch = var0;
			}
		}

		if (UserComparator9.cameraPitch > var0) { // L: 3915
			UserComparator9.cameraPitch -= (UserComparator9.cameraPitch - var0) * ScriptFrame.field459 / 1000 + class83.field1082; // L: 3916
			if (UserComparator9.cameraPitch < var0) { // L: 3917
				UserComparator9.cameraPitch = var0;
			}
		}

		int var2 = var1 - PendingSpawn.cameraYaw; // L: 3919
		if (var2 > 1024) { // L: 3920
			var2 -= 2048;
		}

		if (var2 < -1024) { // L: 3921
			var2 += 2048;
		}

		if (var2 > 0) { // L: 3922
			PendingSpawn.cameraYaw = var2 * ScriptFrame.field459 / 1000 + PendingSpawn.cameraYaw + class83.field1082; // L: 3923
			PendingSpawn.cameraYaw &= 2047; // L: 3924
		}

		if (var2 < 0) { // L: 3926
			PendingSpawn.cameraYaw -= class83.field1082 + -var2 * ScriptFrame.field459 / 1000; // L: 3927
			PendingSpawn.cameraYaw &= 2047; // L: 3928
		}

		int var3 = var1 - PendingSpawn.cameraYaw; // L: 3930
		if (var3 > 1024) { // L: 3931
			var3 -= 2048;
		}

		if (var3 < -1024) { // L: 3932
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 3933
			PendingSpawn.cameraYaw = var1;
		}

	} // L: 3934
}
