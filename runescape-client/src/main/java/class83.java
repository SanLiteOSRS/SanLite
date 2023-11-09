import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public enum class83 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field1076(0, -1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field1074(1, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field1073(2, 3),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field1077(3, 4),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field1081(4, 5),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field1078(5, 6);

	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1715306901
	)
	final int field1075;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 419461411
	)
	final int field1080;

	class83(int var3, int var4) {
		this.field1075 = var3; // L: 21
		this.field1080 = var4; // L: 22
	} // L: 23

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1080; // L: 27
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "106"
	)
	static void method2085() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				ModeWhere.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				ModeWhere.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1511834400"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 112

		try {
			var0 = class433.getPreferencesFile("", class20.field111.name, true); // L: 114
			Buffer var1 = FriendsChatMember.clientPreferences.toBuffer(); // L: 115
			var0.write(var1.array, 0, var1.offset); // L: 116
		} catch (Exception var3) { // L: 118
		}

		try {
			if (var0 != null) { // L: 120
				var0.closeSync(true); // L: 121
			}
		} catch (Exception var2) { // L: 124
		}

	} // L: 125

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lqn;",
		garbageValue = "1267211598"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 365
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 366
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0; // L: 367
		SpritePixels var8;
		if (!var5) { // L: 369
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 370
			if (var8 != null) { // L: 371
				return var8;
			}
		}

		ItemComposition var9 = AttackOption.ItemComposition_get(var0); // L: 373
		if (var1 > 1 && var9.countobj != null) { // L: 374
			int var10 = -1; // L: 375

			for (int var11 = 0; var11 < 10; ++var11) { // L: 376
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 377
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 379
				var9 = AttackOption.ItemComposition_get(var10);
			}
		}

		Model var21 = var9.getModel(1); // L: 381
		if (var21 == null) { // L: 382
			return null;
		} else {
			SpritePixels var22 = null; // L: 383
			if (var9.noteTemplate != -1) { // L: 384
				var22 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 385
				if (var22 == null) { // L: 386
					return null;
				}
			} else if (var9.notedId != -1) { // L: 388
				var22 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 389
				if (var22 == null) { // L: 390
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 392
				var22 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 393
				if (var22 == null) { // L: 394
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 396
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 397
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 398
			int[] var15 = new int[4]; // L: 399
			Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 400
			var8 = new SpritePixels(36, 32); // L: 401
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 402
			Rasterizer2D.Rasterizer2D_clear(); // L: 403
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 404
			Rasterizer3D.method4009(16, 16); // L: 405
			Rasterizer3D.field2352 = false; // L: 406
			if (var9.placeholderTemplate != -1) { // L: 407
				var22.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 408
			if (var5) { // L: 409
				var16 = (int)(1.5D * (double)var16);
			} else if (var2 == 2) { // L: 410
				var16 = (int)(1.04D * (double)var16);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 411
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 412
			var21.calculateBoundsCylinder(); // L: 413
			var21.method4367(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var21.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 414
			if (var9.notedId != -1) { // L: 415
				var22.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 416
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 417
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 418
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 419
			if (var9.noteTemplate != -1) { // L: 420
				var22.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 421
				Font var19 = class137.ItemComposition_fontPlain11; // L: 422
				String var20;
				if (var1 < 100000) { // L: 425
					var20 = "<col=ffff00>" + var1 + "</col>"; // L: 426
				} else if (var1 < 10000000) { // L: 429
					var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>"; // L: 430
				} else {
					var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>"; // L: 433
				}

				var19.draw(var20, 0, 9, 16776960, 1); // L: 435
			}

			if (!var5) { // L: 437
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 438
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 439
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 440
			Rasterizer3D.field2352 = true; // L: 441
			return var8; // L: 442
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1426925804"
	)
	static int method2079(int var0, Script var1, boolean var2) {
		if (var0 == 7600) { // L: 4910
			--UserComparator8.Interpreter_stringStackSize; // L: 4911
			return 1; // L: 4912
		} else if (var0 == 7601) { // L: 4914
			--UserComparator8.Interpreter_stringStackSize; // L: 4915
			return 1; // L: 4916
		} else if (var0 == 7602) { // L: 4918
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4919
			return 1; // L: 4920
		} else if (var0 == 7603) { // L: 4922
			--Nameable.Interpreter_intStackSize; // L: 4923
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 4924
			return 1; // L: 4925
		} else if (var0 == 7604) { // L: 4927
			--UserComparator8.Interpreter_stringStackSize; // L: 4928
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4929
			return 1; // L: 4930
		} else if (var0 == 7605) { // L: 4932
			--Nameable.Interpreter_intStackSize; // L: 4933
			return 1; // L: 4934
		} else if (var0 == 7606) { // L: 4936
			Nameable.Interpreter_intStackSize -= 2; // L: 4937
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4938
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4939
			return 1; // L: 4940
		} else if (var0 == 7607) { // L: 4942
			return 1; // L: 4943
		} else if (var0 == 7608) { // L: 4945
			--UserComparator8.Interpreter_stringStackSize; // L: 4946
			return 1; // L: 4947
		} else if (var0 == 7609) { // L: 4949
			--UserComparator8.Interpreter_stringStackSize; // L: 4950
			return 1; // L: 4951
		} else if (var0 == 7610) { // L: 4953
			--UserComparator8.Interpreter_stringStackSize; // L: 4954
			return 1; // L: 4955
		} else if (var0 == 7611) { // L: 4957
			--Nameable.Interpreter_intStackSize; // L: 4958
			return 1; // L: 4959
		} else if (var0 == 7612) { // L: 4961
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4962
			return 1; // L: 4963
		} else if (var0 == 7613) { // L: 4965
			--Nameable.Interpreter_intStackSize; // L: 4966
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 4967
			return 1; // L: 4968
		} else if (var0 == 7614) { // L: 4970
			return 1; // L: 4971
		} else if (var0 == 7615) { // L: 4973
			--UserComparator8.Interpreter_stringStackSize; // L: 4974
			return 1; // L: 4975
		} else if (var0 == 7616) { // L: 4977
			--UserComparator8.Interpreter_stringStackSize; // L: 4978
			Nameable.Interpreter_intStackSize -= 2; // L: 4979
			return 1; // L: 4980
		} else if (var0 == 7617) { // L: 4982
			--UserComparator8.Interpreter_stringStackSize; // L: 4983
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4984
			return 1; // L: 4985
		} else {
			return 2; // L: 4987
		}
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-112"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (MouseRecorder.pcmPlayer1 != null) { // L: 3490
			MouseRecorder.pcmPlayer1.run();
		}

		if (class78.pcmPlayer0 != null) { // L: 3491
			class78.pcmPlayer0.run();
		}

	} // L: 3492

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "99"
	)
	static final void method2089() {
		if (DirectByteArrayCopier.FriendsChatManager_inFriendsChat) { // L: 3637
			if (class19.friendsChatManager != null) { // L: 3638
				class19.friendsChatManager.sort(); // L: 3639
			}

			FriendSystem.method1670(); // L: 3641
			DirectByteArrayCopier.FriendsChatManager_inFriendsChat = false; // L: 3642
		}

	} // L: 3644
}
