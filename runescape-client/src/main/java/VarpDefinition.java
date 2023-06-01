import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hu")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1794748341
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "-827318739"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return; // L: 33
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)V",
		garbageValue = "-617624623"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	} // L: 38

	@ObfuscatedName("ay")
	public static final void method3559(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				class92.method2337(var0 - 1L); // L: 11
				class92.method2337(1L); // L: 12
			} else {
				class92.method2337(var0); // L: 14
			}

		}
	} // L: 15

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Ljava/io/File;",
		garbageValue = "-8609"
	)
	@Export("getFile")
	public static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 16
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 17
			if (var1 != null) { // L: 18
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 19
				RandomAccessFile var3 = null; // L: 20

				try {
					File var4 = new File(var2.getParent()); // L: 22
					if (!var4.exists()) { // L: 23
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 24
						int var5 = var3.read(); // L: 25
						var3.seek(0L); // L: 26
						var3.write(var5); // L: 27
						var3.seek(0L); // L: 28
						var3.close(); // L: 29
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 30
						return var2; // L: 31
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 35
							var3.close(); // L: 36
							var3 = null; // L: 37
						}
					} catch (Exception var7) { // L: 40
					}

					throw new RuntimeException(); // L: 42
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltn;II)V",
		garbageValue = "1097103453"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 231
		if (var2) { // L: 232
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 233
		Player var4 = Client.players[var1]; // L: 234
		if (var3 == 0) { // L: 235
			if (var2) { // L: 236
				var4.field1107 = false; // L: 237
			} else if (Client.localPlayerIndex == var1) { // L: 240
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class147.baseX * 64 + var4.pathX[0] >> 13 << 14) + (ModeWhere.baseY * 64 + var4.pathY[0] >> 13); // L: 241
				if (var4.field1211 != -1) { // L: 242
					Players.Players_orientations[var1] = var4.field1211;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 243
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 244
				Client.players[var1] = null; // L: 245
				if (var0.readBits(1) != 0) { // L: 246
					class196.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 249
				var5 = var0.readBits(3); // L: 250
				var6 = var4.pathX[0]; // L: 251
				var7 = var4.pathY[0]; // L: 252
				if (var5 == 0) { // L: 253
					--var6; // L: 254
					--var7; // L: 255
				} else if (var5 == 1) { // L: 257
					--var7;
				} else if (var5 == 2) { // L: 258
					++var6; // L: 259
					--var7; // L: 260
				} else if (var5 == 3) { // L: 262
					--var6;
				} else if (var5 == 4) { // L: 263
					++var6;
				} else if (var5 == 5) { // L: 264
					--var6; // L: 265
					++var7; // L: 266
				} else if (var5 == 6) { // L: 268
					++var7;
				} else if (var5 == 7) { // L: 269
					++var6; // L: 270
					++var7; // L: 271
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 273
					var4.resetPath(var6, var7); // L: 274
					var4.field1107 = false; // L: 275
				} else if (var2) { // L: 277
					var4.field1107 = true; // L: 278
					var4.tileX = var6; // L: 279
					var4.tileY = var7; // L: 280
				} else {
					var4.field1107 = false; // L: 283
					var4.method2287(var6, var7, Players.field1342[var1]); // L: 284
				}

			} else if (var3 == 2) { // L: 288
				var5 = var0.readBits(4); // L: 289
				var6 = var4.pathX[0]; // L: 290
				var7 = var4.pathY[0]; // L: 291
				if (var5 == 0) { // L: 292
					var6 -= 2; // L: 293
					var7 -= 2; // L: 294
				} else if (var5 == 1) { // L: 296
					--var6; // L: 297
					var7 -= 2; // L: 298
				} else if (var5 == 2) { // L: 300
					var7 -= 2;
				} else if (var5 == 3) { // L: 301
					++var6; // L: 302
					var7 -= 2; // L: 303
				} else if (var5 == 4) { // L: 305
					var6 += 2; // L: 306
					var7 -= 2; // L: 307
				} else if (var5 == 5) { // L: 309
					var6 -= 2; // L: 310
					--var7; // L: 311
				} else if (var5 == 6) { // L: 313
					var6 += 2; // L: 314
					--var7; // L: 315
				} else if (var5 == 7) { // L: 317
					var6 -= 2;
				} else if (var5 == 8) { // L: 318
					var6 += 2;
				} else if (var5 == 9) { // L: 319
					var6 -= 2; // L: 320
					++var7; // L: 321
				} else if (var5 == 10) { // L: 323
					var6 += 2; // L: 324
					++var7; // L: 325
				} else if (var5 == 11) { // L: 327
					var6 -= 2; // L: 328
					var7 += 2; // L: 329
				} else if (var5 == 12) { // L: 331
					--var6; // L: 332
					var7 += 2; // L: 333
				} else if (var5 == 13) { // L: 335
					var7 += 2;
				} else if (var5 == 14) { // L: 336
					++var6; // L: 337
					var7 += 2; // L: 338
				} else if (var5 == 15) { // L: 340
					var6 += 2; // L: 341
					var7 += 2; // L: 342
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 344
					var4.resetPath(var6, var7); // L: 345
					var4.field1107 = false; // L: 346
				} else if (var2) { // L: 348
					var4.field1107 = true; // L: 349
					var4.tileX = var6; // L: 350
					var4.tileY = var7; // L: 351
				} else {
					var4.field1107 = false; // L: 354
					var4.method2287(var6, var7, Players.field1342[var1]); // L: 355
				}

			} else {
				var5 = var0.readBits(1); // L: 359
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 360
					var6 = var0.readBits(12); // L: 361
					var7 = var6 >> 10; // L: 362
					var8 = var6 >> 5 & 31; // L: 363
					if (var8 > 15) { // L: 364
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 365
					if (var9 > 15) { // L: 366
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 367
					var11 = var9 + var4.pathY[0]; // L: 368
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 369
						if (var2) { // L: 373
							var4.field1107 = true; // L: 374
							var4.tileX = var10; // L: 375
							var4.tileY = var11; // L: 376
						} else {
							var4.field1107 = false; // L: 379
							var4.method2287(var10, var11, Players.field1342[var1]); // L: 380
						}
					} else {
						var4.resetPath(var10, var11); // L: 370
						var4.field1107 = false; // L: 371
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 382
					if (Client.localPlayerIndex == var1) { // L: 383
						NetFileRequest.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 386
					var7 = var6 >> 28; // L: 387
					var8 = var6 >> 14 & 16383; // L: 388
					var9 = var6 & 16383; // L: 389
					var10 = (class147.baseX * 64 + var8 + var4.pathX[0] & 16383) - class147.baseX * 64; // L: 390
					var11 = (ModeWhere.baseY * 64 + var9 + var4.pathY[0] & 16383) - ModeWhere.baseY * 64; // L: 391
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 392
						var4.resetPath(var10, var11); // L: 393
						var4.field1107 = false; // L: 394
					} else if (var2) { // L: 396
						var4.field1107 = true; // L: 397
						var4.tileX = var10; // L: 398
						var4.tileY = var11; // L: 399
					} else {
						var4.field1107 = false; // L: 402
						var4.method2287(var10, var11, Players.field1342[var1]); // L: 403
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 405
					if (Client.localPlayerIndex == var1) { // L: 406
						NetFileRequest.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 238 247 286 357 384 407

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZB)I",
		garbageValue = "100"
	)
	static int method3555(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 620
		Widget var3;
		if (var0 >= 2000) { // L: 621
			var0 -= 1000; // L: 622
			var4 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 623
			var3 = ArchiveDiskActionHandler.getWidget(var4); // L: 624
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : HealthBarUpdate.field1223; // L: 626
		}

		int var13;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 627
			class336.Interpreter_intStackSize -= 2; // L: 628
			var13 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 629
			int var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 630
			if (var3.type == 12) { // L: 631
				class327 var7 = var3.method6544(); // L: 632
				if (var7 != null && var7.method6162(var13, var9)) { // L: 633
					HorizontalAlignment.invalidateWidget(var3); // L: 634
				}
			} else {
				var3.scrollX = var13; // L: 638
				if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 639
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) { // L: 640
					var3.scrollX = 0;
				}

				var3.scrollY = var9; // L: 641
				if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 642
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) { // L: 643
					var3.scrollY = 0;
				}

				HorizontalAlignment.invalidateWidget(var3); // L: 644
			}

			return 1; // L: 646
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 649
			HorizontalAlignment.invalidateWidget(var3); // L: 650
			return 1; // L: 651
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 654
			HorizontalAlignment.invalidateWidget(var3); // L: 655
			return 1; // L: 656
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 659
			HorizontalAlignment.invalidateWidget(var3); // L: 660
			return 1; // L: 661
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 664
			HorizontalAlignment.invalidateWidget(var3); // L: 665
			return 1; // L: 666
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 669
			HorizontalAlignment.invalidateWidget(var3); // L: 670
			return 1; // L: 671
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 674
			HorizontalAlignment.invalidateWidget(var3); // L: 675
			return 1; // L: 676
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 679
			HorizontalAlignment.invalidateWidget(var3); // L: 680
			return 1; // L: 681
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1; // L: 684
			var3.modelId = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 685
			HorizontalAlignment.invalidateWidget(var3); // L: 686
			return 1; // L: 687
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			class336.Interpreter_intStackSize -= 6; // L: 690
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 691
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 692
			var3.modelAngleX = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 693
			var3.modelAngleY = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 3]; // L: 694
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 4]; // L: 695
			var3.modelZoom = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 5]; // L: 696
			HorizontalAlignment.invalidateWidget(var3); // L: 697
			return 1; // L: 698
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var13 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 701
			if (var13 != var3.sequenceId) { // L: 702
				var3.sequenceId = var13; // L: 703
				var3.modelFrame = 0; // L: 704
				var3.modelFrameCycle = 0; // L: 705
				HorizontalAlignment.invalidateWidget(var3); // L: 706
			}

			return 1; // L: 708
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 711
			HorizontalAlignment.invalidateWidget(var3); // L: 712
			return 1; // L: 713
		} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
			String var14 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 716
			if (!var14.equals(var3.text)) { // L: 717
				var3.text = var14; // L: 718
				HorizontalAlignment.invalidateWidget(var3); // L: 719
			}

			return 1; // L: 721
		} else {
			class327 var10;
			if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 724
				if (var3.type == 12) { // L: 725
					var10 = var3.method6544(); // L: 726
					if (var10 != null) { // L: 727
						var10.method6169(); // L: 728
					}
				}

				HorizontalAlignment.invalidateWidget(var3); // L: 731
				return 1; // L: 732
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				class336.Interpreter_intStackSize -= 3; // L: 735
				if (var3.type == 12) { // L: 736
					var10 = var3.method6544(); // L: 737
					if (var10 != null) { // L: 738
						var10.method6163(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]); // L: 739
						var10.method6166(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]); // L: 740
					}
				} else {
					var3.textXAlignment = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 744
					var3.textYAlignment = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 745
					var3.textLineHeight = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 746
				}

				HorizontalAlignment.invalidateWidget(var3); // L: 748
				return 1; // L: 749
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 752
				HorizontalAlignment.invalidateWidget(var3); // L: 753
				return 1; // L: 754
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 757
				HorizontalAlignment.invalidateWidget(var3); // L: 758
				return 1; // L: 759
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 762
				HorizontalAlignment.invalidateWidget(var3); // L: 763
				return 1; // L: 764
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 767
				HorizontalAlignment.invalidateWidget(var3); // L: 768
				return 1; // L: 769
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 772
				HorizontalAlignment.invalidateWidget(var3); // L: 773
				return 1; // L: 774
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				class336.Interpreter_intStackSize -= 2; // L: 777
				var3.scrollWidth = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 778
				var3.scrollHeight = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 779
				HorizontalAlignment.invalidateWidget(var3); // L: 780
				if (var4 != -1 && var3.type == 0) { // L: 781
					class166.revalidateWidgetScroll(UserComparator6.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 782
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				GrandExchangeOfferTotalQuantityComparator.resumePauseWidget(var3.id, var3.childIndex); // L: 785
				Client.meslayerContinueWidget = var3; // L: 786
				HorizontalAlignment.invalidateWidget(var3); // L: 787
				return 1; // L: 788
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 791
				HorizontalAlignment.invalidateWidget(var3); // L: 792
				return 1; // L: 793
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 796
				HorizontalAlignment.invalidateWidget(var3); // L: 797
				return 1; // L: 798
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 801
				HorizontalAlignment.invalidateWidget(var3); // L: 802
				return 1; // L: 803
			} else if (var0 == 1125) {
				var13 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 806
				class512 var11 = (class512)class217.findEnumerated(ArchiveLoader.FillMode_values(), var13); // L: 807
				if (var11 != null) { // L: 808
					var3.fillMode = var11; // L: 809
					HorizontalAlignment.invalidateWidget(var3); // L: 810
				}

				return 1; // L: 812
			} else {
				boolean var8;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var8 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 815
					var3.field3642 = var8; // L: 816
					return 1; // L: 817
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var8 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 820
					var3.modelTransparency = var8; // L: 821
					return 1; // L: 822
				} else if (var0 == 1129) {
					var3.field3645 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 825
					HorizontalAlignment.invalidateWidget(var3); // L: 826
					return 1; // L: 827
				} else if (var0 == 1130) {
					var3.method6436(Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize], PendingSpawn.urlRequester, SoundCache.method849()); // L: 830
					return 1; // L: 831
				} else if (var0 == 1131) {
					class336.Interpreter_intStackSize -= 2; // L: 834
					var3.swapItems(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]); // L: 835
					return 1; // L: 836
				} else if (var0 == 1132) {
					var3.method6443(Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 839
					return 1; // L: 840
				} else {
					class322 var12;
					if (var0 == 1133) {
						--class336.Interpreter_intStackSize; // L: 843
						var12 = var3.method6456(); // L: 844
						if (var12 != null) { // L: 845
							var12.field3520 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 846
							HorizontalAlignment.invalidateWidget(var3); // L: 847
						}

						return 1; // L: 849
					} else if (var0 == 1134) {
						--class336.Interpreter_intStackSize; // L: 852
						var12 = var3.method6456(); // L: 853
						if (var12 != null) { // L: 854
							var12.field3519 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 855
							HorizontalAlignment.invalidateWidget(var3); // L: 856
						}

						return 1; // L: 858
					} else if (var0 == 1135) {
						--class156.Interpreter_stringStackSize; // L: 861
						var10 = var3.method6544(); // L: 862
						if (var10 != null) { // L: 863
							var3.field3684 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize]; // L: 864
						}

						return 1; // L: 866
					} else if (var0 == 1136) {
						--class336.Interpreter_intStackSize; // L: 869
						var12 = var3.method6456(); // L: 870
						if (var12 != null) { // L: 871
							var12.field3518 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 872
							HorizontalAlignment.invalidateWidget(var3); // L: 873
						}

						return 1; // L: 875
					} else if (var0 == 1137) {
						--class336.Interpreter_intStackSize; // L: 878
						var10 = var3.method6544(); // L: 879
						if (var10 != null && var10.method6275(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize])) { // L: 880
							HorizontalAlignment.invalidateWidget(var3); // L: 881
						}

						return 1; // L: 883
					} else if (var0 == 1138) {
						--class336.Interpreter_intStackSize; // L: 886
						var10 = var3.method6544(); // L: 887
						if (var10 != null && var10.method6415(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize])) { // L: 888
							HorizontalAlignment.invalidateWidget(var3); // L: 889
						}

						return 1; // L: 891
					} else if (var0 == 1139) {
						--class336.Interpreter_intStackSize; // L: 894
						var10 = var3.method6544(); // L: 895
						if (var10 != null && var10.method6317(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize])) { // L: 896
							HorizontalAlignment.invalidateWidget(var3); // L: 897
						}

						return 1; // L: 899
					} else {
						class327 var6;
						if (var0 == 1140) {
							var8 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 902
							Client.field616.method4052(); // L: 903
							var6 = var3.method6544(); // L: 904
							if (var6 != null && var6.method6190(var8)) { // L: 905
								if (var8) { // L: 906
									Client.field616.method4058(var3); // L: 907
								}

								HorizontalAlignment.invalidateWidget(var3); // L: 909
							}

							return 1; // L: 911
						} else if (var0 == 1141) {
							var8 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 914
							if (!var8 && Client.field616.method4054() == var3) { // L: 915
								Client.field616.method4052(); // L: 916
								HorizontalAlignment.invalidateWidget(var3); // L: 917
							}

							var6 = var3.method6544(); // L: 919
							if (var6 != null) { // L: 920
								var6.method6390(var8); // L: 921
							}

							return 1; // L: 923
						} else if (var0 == 1142) {
							class336.Interpreter_intStackSize -= 2; // L: 926
							var10 = var3.method6544(); // L: 927
							if (var10 != null && var10.method6402(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1])) { // L: 928
								HorizontalAlignment.invalidateWidget(var3); // L: 929
							}

							return 1; // L: 931
						} else if (var0 == 1143) {
							--class336.Interpreter_intStackSize; // L: 934
							var10 = var3.method6544(); // L: 935
							if (var10 != null && var10.method6402(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize])) { // L: 936
								HorizontalAlignment.invalidateWidget(var3); // L: 937
							}

							return 1; // L: 939
						} else if (var0 == 1144) {
							--class336.Interpreter_intStackSize; // L: 942
							var10 = var3.method6544(); // L: 943
							if (var10 != null) { // L: 944
								var10.method6267(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]); // L: 945
								HorizontalAlignment.invalidateWidget(var3); // L: 946
							}

							return 1; // L: 948
						} else if (var0 == 1145) {
							--class336.Interpreter_intStackSize; // L: 951
							var10 = var3.method6544(); // L: 952
							if (var10 != null) { // L: 953
								var10.method6165(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]); // L: 954
							}

							return 1; // L: 956
						} else if (var0 == 1146) {
							--class336.Interpreter_intStackSize; // L: 959
							var10 = var3.method6544(); // L: 960
							if (var10 != null) { // L: 961
								var10.method6366(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]); // L: 962
							}

							return 1; // L: 964
						} else if (var0 == 1147) {
							--class336.Interpreter_intStackSize; // L: 967
							var10 = var3.method6544(); // L: 968
							if (var10 != null) { // L: 969
								var10.method6167(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]); // L: 970
								HorizontalAlignment.invalidateWidget(var3); // L: 971
							}

							return 1; // L: 973
						} else {
							class27 var5;
							if (var0 == 1148) {
								class336.Interpreter_intStackSize -= 2; // L: 976
								var5 = var3.method6457(); // L: 977
								if (var5 != null) { // L: 978
									var5.method392(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]); // L: 979
								}

								return 1; // L: 981
							} else if (var0 == 1149) {
								class336.Interpreter_intStackSize -= 2; // L: 984
								var5 = var3.method6457(); // L: 985
								if (var5 != null) { // L: 986
									var5.method371((char)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]); // L: 987
								}

								return 1; // L: 989
							} else if (var0 == 1150) {
								var3.method6440(Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize], PendingSpawn.urlRequester); // L: 992
								return 1; // L: 993
							} else {
								return 2; // L: 995
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "3"
	)
	static final void method3549(int var0, int var1, int var2, boolean var3) {
		if (WorldMapAreaData.loadInterface(var0)) { // L: 10825
			UserComparator6.resizeInterface(UserComparator6.Widget_interfaceComponents[var0], -1, var1, var2, var3); // L: 10826
		}
	} // L: 10827

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "181"
	)
	static void method3551() {
		if (Client.oculusOrbState == 1) { // L: 12582
			Client.field579 = true; // L: 12583
		}

	} // L: 12585
}
