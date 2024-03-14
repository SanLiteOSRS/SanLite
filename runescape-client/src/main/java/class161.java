import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gn")
public abstract class class161 extends Node {
	@ObfuscatedName("by")
	protected static String field1781;

	class161() {
	} // L: 51

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1174207862"
	)
	abstract void vmethod3504(Buffer var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "378355771"
	)
	abstract void vmethod3509(ClanChannel var1);

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "85"
	)
	static int method3440(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3876
			var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 3877
			var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3878
			Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3 + var10; // L: 3879
			return 1; // L: 3880
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3882
				class60.Interpreter_stringStackSize -= 2; // L: 3883
				var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize]; // L: 3884
				var4 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1]; // L: 3885
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3886
				return 1; // L: 3887
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3889
				var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 3890
				var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3891
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3 + WorldMapData_1.intToString(var10, true); // L: 3892
				return 1; // L: 3893
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3895
				var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 3896
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3897
				return 1; // L: 3898
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3900
					var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3901
					long var14 = (11745L + (long)var11) * 86400000L; // L: 3902
					Interpreter.Interpreter_calendar.setTime(new Date(var14)); // L: 3903
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3904
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3905
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3906
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3907
					return 1; // L: 3908
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3910
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3922
						var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3923
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = Integer.toString(var11); // L: 3924
						return 1; // L: 3925
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3927
						class60.Interpreter_stringStackSize -= 2; // L: 3928
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ServerPacket.method6054(PlayerType.compareStrings(Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1], WorldMapCacheName.clientLanguage)); // L: 3929
						return 1; // L: 3930
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3932
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 3933
							Interpreter.Interpreter_intStackSize -= 2; // L: 3934
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3935
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3936
							var12 = class25.archive13.takeFile(var9, 0); // L: 3937
							var13 = new Font(var12); // L: 3938
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10); // L: 3939
							return 1; // L: 3940
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3942
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 3943
							Interpreter.Interpreter_intStackSize -= 2; // L: 3944
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3945
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3946
							var12 = class25.archive13.takeFile(var9, 0); // L: 3947
							var13 = new Font(var12); // L: 3948
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10); // L: 3949
							return 1; // L: 3950
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3952
							class60.Interpreter_stringStackSize -= 2; // L: 3953
							var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize]; // L: 3954
							var4 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1]; // L: 3955
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 3956
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4; // L: 3957
							}

							return 1; // L: 3958
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3960
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 3961
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3962
							return 1; // L: 3963
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3965
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 3966
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3967
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3 + (char)var10; // L: 3968
							return 1; // L: 3969
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3971
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3972
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WallObject.isCharPrintable((char)var11) ? 1 : 0; // L: 3973
							return 1; // L: 3974
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3976
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3977
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WallObject.isAlphaNumeric((char)var11) ? 1 : 0; // L: 3978
							return 1; // L: 3979
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3981
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3982
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class154.isCharAlphabetic((char)var11) ? 1 : 0; // L: 3983
							return 1; // L: 3984
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3986
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3987
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class237.isDigit((char)var11) ? 1 : 0; // L: 3988
							return 1; // L: 3989
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3991
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 3992
							if (var3 != null) { // L: 3993
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3994
							}

							return 1; // L: 3995
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3997
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 3998
							Interpreter.Interpreter_intStackSize -= 2; // L: 3999
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4000
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4001
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.substring(var10, var9); // L: 4002
							return 1; // L: 4003
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 4005
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 4006
							StringBuilder var16 = new StringBuilder(var3.length()); // L: 4007
							boolean var18 = false; // L: 4008

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 4009
								char var7 = var3.charAt(var6); // L: 4010
								if (var7 == '<') { // L: 4011
									var18 = true;
								} else if (var7 == '>') { // L: 4012
									var18 = false;
								} else if (!var18) { // L: 4013
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var16.toString(); // L: 4015
							return 1; // L: 4016
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 4018
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 4019
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4020
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var10); // L: 4021
							return 1; // L: 4022
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 4024
							class60.Interpreter_stringStackSize -= 2; // L: 4025
							var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize]; // L: 4026
							var4 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1]; // L: 4027
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4028
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9); // L: 4029
							return 1; // L: 4030
						} else if (var0 == 4122) { // L: 4032
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 4033
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 4034
							return 1; // L: 4035
						} else if (var0 == 4123) { // L: 4037
							class60.Interpreter_stringStackSize -= 3; // L: 4038
							var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize]; // L: 4039
							var4 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1]; // L: 4040
							String var5 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 2]; // L: 4041
							if (VarpDefinition.localPlayer.appearance == null) { // L: 4042
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var5; // L: 4043
								return 1; // L: 4044
							} else {
								switch(VarpDefinition.localPlayer.appearance.field3664) { // L: 4046
								case 0:
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3; // L: 4055
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4; // L: 4048
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var5; // L: 4052
								}

								return 1; // L: 4058
							}
						} else {
							return 2; // L: 4060
						}
					}
				} else {
					class60.Interpreter_stringStackSize -= 2; // L: 3911
					var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize]; // L: 3912
					var4 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1]; // L: 3913
					if (VarpDefinition.localPlayer.appearance != null && VarpDefinition.localPlayer.appearance.field3665 != 0) { // L: 3914
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4; // L: 3918
					} else {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3; // L: 3915
					}

					return 1; // L: 3920
				}
			}
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Lmn;B)V",
		garbageValue = "-42"
	)
	static void method3436(PacketBufferNode var0) {
		var0.packetBuffer.method9677(Client.field556.hash); // L: 2747
		var0.packetBuffer.method9677(class19.archive2.hash); // L: 2748
		var0.packetBuffer.method9525(class154.field1724.hash); // L: 2749
		var0.packetBuffer.method9525(class170.field1832.hash); // L: 2750
		var0.packetBuffer.method9677(class362.field3958.hash); // L: 2751
		var0.packetBuffer.method9528(WorldMapSectionType.archive12.hash); // L: 2752
		var0.packetBuffer.method9525(ScriptFrame.field464.hash); // L: 2753
		var0.packetBuffer.writeInt(0); // L: 2754
		var0.packetBuffer.method9525(WorldMapSectionType.field2612.hash); // L: 2755
		var0.packetBuffer.writeInt(Varcs.field1417.hash); // L: 2756
		var0.packetBuffer.method9528(SpotAnimationDefinition.field2045.hash); // L: 2757
		var0.packetBuffer.method9528(class12.field52.hash); // L: 2758
		var0.packetBuffer.writeInt(class198.field2070.hash); // L: 2759
		var0.packetBuffer.method9528(JagexCache.field2336.hash); // L: 2760
	} // L: 2761

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "([Lng;IIIIIIIB)V",
		garbageValue = "-27"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11492
			Widget var9 = var0[var8]; // L: 11493
			if (var9 != null && var9.parentId == var1 && (var9.method6803() || class429.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11494 11495 11496
				if (var9.isIf3) { // L: 11497
					if (PcmPlayer.isComponentHidden(var9)) { // L: 11498
						continue;
					}
				} else if (var9.type == 0 && var9 != class134.mousedOverWidgetIf1 && PcmPlayer.isComponentHidden(var9)) { // L: 11501
					continue;
				}

				if (var9.type == 11) { // L: 11503
					if (var9.method6820(ArchiveLoader.field1070, InvDefinition.urlRequester)) { // L: 11504
						if (var9.method6895()) { // L: 11505
							UserComparator5.invalidateWidget(var9); // L: 11506
							class167.revalidateWidgetScroll(var9.children, var9, true); // L: 11507
							var9.method6819().method4161().method4262(3, var9.method6819().method4141()); // L: 11508
						}

						if (var9.field3737 != null) { // L: 11510
							ScriptEvent var10 = new ScriptEvent(); // L: 11511
							var10.widget = var9; // L: 11512
							var10.args = var9.field3737; // L: 11513
							Client.scriptEvents.addFirst(var10); // L: 11514
						}
					}
				} else if (var9.type == 12 && var9.method6828(ArchiveLoader.field1070)) { // L: 11518 11519
					UserComparator5.invalidateWidget(var9); // L: 11520
				}

				int var26 = var9.x + var6; // L: 11523
				int var11 = var7 + var9.y; // L: 11524
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) { // L: 11529
					var16 = var26; // L: 11530
					var17 = var11; // L: 11531
					var18 = var26 + var9.width; // L: 11532
					int var19 = var11 + var9.height; // L: 11533
					if (var18 < var26) { // L: 11534
						var16 = var18; // L: 11536
						var18 = var26; // L: 11537
					}

					if (var19 < var11) { // L: 11539
						var17 = var19; // L: 11541
						var19 = var11; // L: 11542
					}

					++var18; // L: 11544
					++var19; // L: 11545
					var12 = var16 > var2 ? var16 : var2; // L: 11546
					var13 = var17 > var3 ? var17 : var3; // L: 11547
					var14 = var18 < var4 ? var18 : var4; // L: 11548
					var15 = var19 < var5 ? var19 : var5; // L: 11549
				} else {
					var16 = var26 + var9.width; // L: 11552
					var17 = var11 + var9.height; // L: 11553
					var12 = var26 > var2 ? var26 : var2; // L: 11554
					var13 = var11 > var3 ? var11 : var3; // L: 11555
					var14 = var16 < var4 ? var16 : var4; // L: 11556
					var15 = var17 < var5 ? var17 : var5; // L: 11557
				}

				if (var9 == Client.clickedWidget) { // L: 11559
					Client.field810 = true; // L: 11560
					Client.field640 = var26; // L: 11561
					Client.field720 = var11; // L: 11562
				}

				boolean var34 = false; // L: 11564
				if (var9.field3808) { // L: 11565
					switch(Client.field575) { // L: 11566
					case 0:
						var34 = true; // L: 11573
					case 1:
					default:
						break;
					case 2:
						if (Client.field701 == var9.id >>> 16) { // L: 11576
							var34 = true; // L: 11577
						}
						break;
					case 3:
						if (var9.id == Client.field701) { // L: 11568
							var34 = true; // L: 11569
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11582
					if (var9.isIf3) { // L: 11583
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11584
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11585
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11586
									if (var27.field1095) { // L: 11587
										var27.remove(); // L: 11588
										var27.widget.field3863 = false; // L: 11589
									}
								}

								class325.method6326(); // L: 11592
								if (WorldMapLabelSize.widgetDragDuration == 0) { // L: 11593
									Client.clickedWidget = null; // L: 11594
									Client.clickedWidgetParent = null; // L: 11595
								}

								if (!Client.isMenuOpen) { // L: 11597
									class255.addCancelMenuEntry(); // L: 11598
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11602 11603
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11604
								if (var27.field1095 && var27.widget.onScroll == var27.args) { // L: 11605
									var27.remove(); // L: 11606
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11612
					var18 = MouseHandler.MouseHandler_y; // L: 11613
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11614
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11615
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11616
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11618
					if (var9.contentType == 1337) { // L: 11619
						if (!Client.field610 && !Client.isMenuOpen && var35) { // L: 11620
							class223.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11623
						GrandExchangeEvent.checkIfMinimapClicked(var9, var26, var11); // L: 11624
					} else {
						if (var9.contentType == 1400) { // L: 11627
							Tiles.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11628
						}

						if (!Client.isMenuOpen && var35) { // L: 11630
							if (var9.contentType == 1400) { // L: 11631
								Tiles.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11632
							} else {
								class188.method3695(var9); // L: 11635
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 11638
							for (int var20 = 0; var20 < var9.field3739.length; ++var20) { // L: 11639
								var21 = false; // L: 11640
								boolean var28 = false; // L: 11641
								if (!var21 && var9.field3739[var20] != null) { // L: 11642
									for (var23 = 0; var23 < var9.field3739[var20].length; ++var23) { // L: 11643
										boolean var24 = false; // L: 11644
										if (var9.field3871 != null) { // L: 11645
											var24 = Client.field792.method4466(var9.field3739[var20][var23]); // L: 11646
										}

										if (Login.method2193(var9.field3739[var20][var23]) || var24) { // L: 11648
											var21 = true; // L: 11649
											if (var9.field3871 != null && var9.field3871[var20] > Client.cycle) { // L: 11650
												break;
											}

											byte var33 = var9.field3806[var20][var23]; // L: 11651
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field792.method4466(86) && !Client.field792.method4466(82) && !Client.field792.method4466(81)) && ((var33 & 2) == 0 || Client.field792.method4466(86)) && ((var33 & 1) == 0 || Client.field792.method4466(82)) && ((var33 & 4) == 0 || Client.field792.method4466(81))) { // L: 11652 11653 11654 11655 11656
												var28 = true; // L: 11658
												break; // L: 11659
											}
										}
									}
								}

								if (var28) { // L: 11664
									if (var20 < 10) { // L: 11665
										class185.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11666
										GameObject.method5963(); // L: 11667
										VarbitComposition.method3820(var9.id, var9.childIndex, TextureProvider.Widget_unpackTargetMask(class429.getWidgetFlags(var9)), var9.itemId); // L: 11668
										Client.field696 = UserComparator9.Widget_getSpellActionName(var9); // L: 11669
										if (Client.field696 == null) { // L: 11670
											Client.field696 = "null";
										}

										Client.field574 = var9.dataText + class370.colorStartTag(16777215); // L: 11671
									}

									var23 = var9.field3820[var20]; // L: 11673
									if (var9.field3871 == null) { // L: 11674
										var9.field3871 = new int[var9.field3739.length];
									}

									if (var9.field3804 == null) { // L: 11675
										var9.field3804 = new int[var9.field3739.length];
									}

									if (var23 != 0) { // L: 11676
										if (var9.field3871[var20] == 0) { // L: 11677
											var9.field3871[var20] = var23 + Client.cycle + var9.field3804[var20];
										} else {
											var9.field3871[var20] = var23 + Client.cycle; // L: 11678
										}
									} else {
										var9.field3871[var20] = Integer.MAX_VALUE; // L: 11680
									}
								}

								if (!var21 && var9.field3871 != null) { // L: 11682 11683
									var9.field3871[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11687
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11688
								var35 = true;
							} else {
								var35 = false; // L: 11689
							}

							boolean var36 = false; // L: 11690
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class524.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11691
								var36 = true;
							}

							var21 = false; // L: 11692
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class524.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11693
								var21 = true;
							}

							if (var21) { // L: 11694
								class27.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11695
							}

							if (var9.method6831()) { // L: 11697
								if (var21) { // L: 11698
									Client.field744.addFirst(new class227(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11699
								}

								if (var36) { // L: 11701
									Client.field744.addFirst(new class227(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11702
								}
							}

							if (var9.contentType == 1400) { // L: 11705
								Tiles.worldMap.method8903(var17, var18, var35 & var36, var35 & var21); // L: 11706
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && Decimator.method1103(class429.getWidgetFlags(var9))) { // L: 11708
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11709
								Client.field746 = true; // L: 11710
								Client.field765 = var26; // L: 11711
								Client.field774 = var11; // L: 11712
							}

							if (var9.hasListener) { // L: 11714
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11715
									var22 = new ScriptEvent(); // L: 11716
									var22.field1095 = true; // L: 11717
									var22.widget = var9; // L: 11718
									var22.mouseY = Client.mouseWheelRotation; // L: 11719
									var22.args = var9.onScroll; // L: 11720
									Client.scriptEvents.addFirst(var22); // L: 11721
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11723
									var21 = false; // L: 11724
									var36 = false; // L: 11725
									var35 = false; // L: 11726
								}

								if (!var9.field3864 && var21) { // L: 11728
									var9.field3864 = true; // L: 11729
									if (var9.onClick != null) { // L: 11730
										var22 = new ScriptEvent(); // L: 11731
										var22.field1095 = true; // L: 11732
										var22.widget = var9; // L: 11733
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11734
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11735
										var22.args = var9.onClick; // L: 11736
										Client.scriptEvents.addFirst(var22); // L: 11737
									}
								}

								if (var9.field3864 && var36 && var9.onClickRepeat != null) { // L: 11740 11741
									var22 = new ScriptEvent(); // L: 11742
									var22.field1095 = true; // L: 11743
									var22.widget = var9; // L: 11744
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11745
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11746
									var22.args = var9.onClickRepeat; // L: 11747
									Client.scriptEvents.addFirst(var22); // L: 11748
								}

								if (var9.field3864 && !var36) { // L: 11751
									var9.field3864 = false; // L: 11752
									if (var9.onRelease != null) { // L: 11753
										var22 = new ScriptEvent(); // L: 11754
										var22.field1095 = true; // L: 11755
										var22.widget = var9; // L: 11756
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11757
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11758
										var22.args = var9.onRelease; // L: 11759
										Client.field533.addFirst(var22); // L: 11760
									}
								}

								if (var36 && var9.onHold != null) { // L: 11763 11764
									var22 = new ScriptEvent(); // L: 11765
									var22.field1095 = true; // L: 11766
									var22.widget = var9; // L: 11767
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11768
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11769
									var22.args = var9.onHold; // L: 11770
									Client.scriptEvents.addFirst(var22); // L: 11771
								}

								if (!var9.field3863 && var35) { // L: 11774
									var9.field3863 = true; // L: 11775
									if (var9.onMouseOver != null) { // L: 11776
										var22 = new ScriptEvent(); // L: 11777
										var22.field1095 = true; // L: 11778
										var22.widget = var9; // L: 11779
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11780
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11781
										var22.args = var9.onMouseOver; // L: 11782
										Client.scriptEvents.addFirst(var22); // L: 11783
									}
								}

								if (var9.field3863 && var35 && var9.onMouseRepeat != null) { // L: 11786 11787
									var22 = new ScriptEvent(); // L: 11788
									var22.field1095 = true; // L: 11789
									var22.widget = var9; // L: 11790
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11791
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11792
									var22.args = var9.onMouseRepeat; // L: 11793
									Client.scriptEvents.addFirst(var22); // L: 11794
								}

								if (var9.field3863 && !var35) { // L: 11797
									var9.field3863 = false; // L: 11798
									if (var9.onMouseLeave != null) { // L: 11799
										var22 = new ScriptEvent(); // L: 11800
										var22.field1095 = true; // L: 11801
										var22.widget = var9; // L: 11802
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11803
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11804
										var22.args = var9.onMouseLeave; // L: 11805
										Client.field533.addFirst(var22); // L: 11806
									}
								}

								if (var9.onTimer != null) { // L: 11809
									var22 = new ScriptEvent(); // L: 11810
									var22.widget = var9; // L: 11811
									var22.args = var9.onTimer; // L: 11812
									Client.field802.addFirst(var22); // L: 11813
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field823 > var9.field3866) { // L: 11815
									if (var9.varTransmitTriggers != null && Client.field823 - var9.field3866 <= 32) { // L: 11816
										label835:
										for (var39 = var9.field3866; var39 < Client.field823; ++var39) { // L: 11823
											var23 = Client.field702[var39 & 31]; // L: 11824

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 11825
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 11826
													var25 = new ScriptEvent(); // L: 11827
													var25.widget = var9; // L: 11828
													var25.args = var9.onVarTransmit; // L: 11829
													Client.scriptEvents.addFirst(var25); // L: 11830
													break label835; // L: 11831
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11817
										var22.widget = var9; // L: 11818
										var22.args = var9.onVarTransmit; // L: 11819
										Client.scriptEvents.addFirst(var22); // L: 11820
									}

									var9.field3866 = Client.field823; // L: 11836
								}

								if (var9.onInvTransmit != null && Client.field608 > var9.field3867) { // L: 11838
									if (var9.invTransmitTriggers != null && Client.field608 - var9.field3867 <= 32) { // L: 11839
										label811:
										for (var39 = var9.field3867; var39 < Client.field608; ++var39) { // L: 11846
											var23 = Client.field646[var39 & 31]; // L: 11847

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 11848
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 11849
													var25 = new ScriptEvent(); // L: 11850
													var25.widget = var9; // L: 11851
													var25.args = var9.onInvTransmit; // L: 11852
													Client.scriptEvents.addFirst(var25); // L: 11853
													break label811; // L: 11854
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11840
										var22.widget = var9; // L: 11841
										var22.args = var9.onInvTransmit; // L: 11842
										Client.scriptEvents.addFirst(var22); // L: 11843
									}

									var9.field3867 = Client.field608; // L: 11859
								}

								if (var9.onStatTransmit != null && Client.field782 > var9.field3831) { // L: 11861
									if (var9.statTransmitTriggers != null && Client.field782 - var9.field3831 <= 32) { // L: 11862
										label787:
										for (var39 = var9.field3831; var39 < Client.field782; ++var39) { // L: 11869
											var23 = Client.field727[var39 & 31]; // L: 11870

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 11871
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 11872
													var25 = new ScriptEvent(); // L: 11873
													var25.widget = var9; // L: 11874
													var25.args = var9.onStatTransmit; // L: 11875
													Client.scriptEvents.addFirst(var25); // L: 11876
													break label787; // L: 11877
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11863
										var22.widget = var9; // L: 11864
										var22.args = var9.onStatTransmit; // L: 11865
										Client.scriptEvents.addFirst(var22); // L: 11866
									}

									var9.field3831 = Client.field782; // L: 11882
								}

								if (Client.chatCycle > var9.field3865 && var9.onChatTransmit != null) { // L: 11884
									var22 = new ScriptEvent(); // L: 11885
									var22.widget = var9; // L: 11886
									var22.args = var9.onChatTransmit; // L: 11887
									Client.scriptEvents.addFirst(var22); // L: 11888
								}

								if (Client.field732 > var9.field3865 && var9.onFriendTransmit != null) { // L: 11890
									var22 = new ScriptEvent(); // L: 11891
									var22.widget = var9; // L: 11892
									var22.args = var9.onFriendTransmit; // L: 11893
									Client.scriptEvents.addFirst(var22); // L: 11894
								}

								if (Client.field733 > var9.field3865 && var9.onClanTransmit != null) { // L: 11896
									var22 = new ScriptEvent(); // L: 11897
									var22.widget = var9; // L: 11898
									var22.args = var9.onClanTransmit; // L: 11899
									Client.scriptEvents.addFirst(var22); // L: 11900
								}

								if (Client.field734 > var9.field3865 && var9.field3841 != null) { // L: 11902
									var22 = new ScriptEvent(); // L: 11903
									var22.widget = var9; // L: 11904
									var22.args = var9.field3841; // L: 11905
									Client.scriptEvents.addFirst(var22); // L: 11906
								}

								if (Client.field735 > var9.field3865 && var9.field3730 != null) { // L: 11908
									var22 = new ScriptEvent(); // L: 11909
									var22.widget = var9; // L: 11910
									var22.args = var9.field3730; // L: 11911
									Client.scriptEvents.addFirst(var22); // L: 11912
								}

								if (Client.field736 > var9.field3865 && var9.onStockTransmit != null) { // L: 11914
									var22 = new ScriptEvent(); // L: 11915
									var22.widget = var9; // L: 11916
									var22.args = var9.onStockTransmit; // L: 11917
									Client.scriptEvents.addFirst(var22); // L: 11918
								}

								if (Client.field537 > var9.field3865 && var9.field3848 != null) { // L: 11920
									var22 = new ScriptEvent(); // L: 11921
									var22.widget = var9; // L: 11922
									var22.args = var9.field3848; // L: 11923
									Client.scriptEvents.addFirst(var22); // L: 11924
								}

								if (Client.field738 > var9.field3865 && var9.onMiscTransmit != null) { // L: 11926
									var22 = new ScriptEvent(); // L: 11927
									var22.widget = var9; // L: 11928
									var22.args = var9.onMiscTransmit; // L: 11929
									Client.scriptEvents.addFirst(var22); // L: 11930
								}

								var9.field3865 = Client.cycleCntr; // L: 11932
								if (var9.onKey != null) { // L: 11933
									for (var39 = 0; var39 < Client.field706; ++var39) { // L: 11934
										ScriptEvent var32 = new ScriptEvent(); // L: 11935
										var32.widget = var9; // L: 11936
										var32.keyTyped = Client.field768[var39]; // L: 11937
										var32.keyPressed = Client.field660[var39]; // L: 11938
										var32.args = var9.onKey; // L: 11939
										Client.scriptEvents.addFirst(var32); // L: 11940
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3837 != null) { // L: 11943
									var38 = Client.field792.method4434(); // L: 11944

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11945
										var31 = new ScriptEvent(); // L: 11946
										var31.widget = var9; // L: 11947
										var31.keyTyped = var38[var23]; // L: 11948
										var31.args = var9.field3837; // L: 11949
										Client.scriptEvents.addFirst(var31); // L: 11950
									}
								}

								if (var9.field3838 != null) { // L: 11953
									var38 = Client.field792.method4435(); // L: 11954

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11955
										var31 = new ScriptEvent(); // L: 11956
										var31.widget = var9; // L: 11957
										var31.keyTyped = var38[var23]; // L: 11958
										var31.args = var9.field3838; // L: 11959
										Client.scriptEvents.addFirst(var31); // L: 11960
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11965
							if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 11966
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.field3752 != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11967
								if (var9.mouseOverRedirect >= 0) { // L: 11968
									class134.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class134.mousedOverWidgetIf1 = var9; // L: 11969
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11971
								FontName.field5062 = var9; // L: 11972
							}

							if (var9.scrollHeight > var9.height) { // L: 11974
								Login.method2201(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11976
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11977
							if (var9.children != null) { // L: 11978
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11979
							if (var29 != null) { // L: 11980
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11981
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11982
										if (var30.field1095) { // L: 11983
											var30.remove(); // L: 11984
											var30.widget.field3863 = false; // L: 11985
										}
									}

									if (WorldMapLabelSize.widgetDragDuration == 0) { // L: 11988
										Client.clickedWidget = null; // L: 11989
										Client.clickedWidgetParent = null; // L: 11990
									}

									if (!Client.isMenuOpen) { // L: 11992
										class255.addCancelMenuEntry(); // L: 11993
									}
								}

								ClanSettings.method3336(var29.group, var12, var13, var14, var15, var26, var11); // L: 11996
							}
						}
					}
				}
			}
		}

	} // L: 12000
}
