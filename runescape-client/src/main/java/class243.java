import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ir")
public class class243 {
	@ObfuscatedName("g")
	@Export("SpriteBuffer_xOffsets")
	public static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("e")
	@Export("cacheParentPaths")
	static String[] cacheParentPaths;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lcp;III)V",
		garbageValue = "1435442863"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var19;
		if (class369.isWorldMapEvent(var0.type)) {
			class257.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var5 = WorldMapAreaData.WorldMapElement_get(class257.worldMapEvent.mapElement);
			var4 = SceneTilePaint.getWorldMapScript(var0.type, var5.objectId, var5.category);
		} else {
			var19 = (Integer)var3[0];
			var4 = ItemComposition.getScript(var19);
		}

		if (var4 != null) {
			WorldMapCacheName.Interpreter_intStackSize = 0;
			class13.Interpreter_stringStackSize = 0;
			var19 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field950 = false;
			boolean var9 = false;
			int var10 = 0;

			try {
				int var13;
				try {
					ScriptFrame.Interpreter_intLocals = new int[var4.localIntCount];
					int var11 = 0;
					Interpreter.Interpreter_stringLocals = new String[var4.localStringCount];
					int var12 = 0;

					int var14;
					String var20;
					for (var13 = 1; var13 < var3.length; ++var13) {
						if (var3[var13] instanceof Integer) {
							var14 = (Integer)var3[var13];
							if (var14 == -2147483647) {
								var14 = var0.mouseX;
							}

							if (var14 == -2147483646) {
								var14 = var0.mouseY;
							}

							if (var14 == -2147483645) {
								var14 = var0.widget != null ? var0.widget.id : -1;
							}

							if (var14 == -2147483644) {
								var14 = var0.opIndex;
							}

							if (var14 == -2147483643) {
								var14 = var0.widget != null ? var0.widget.childIndex : -1;
							}

							if (var14 == -2147483642) {
								var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
							}

							if (var14 == -2147483641) {
								var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
							}

							if (var14 == -2147483640) {
								var14 = var0.keyTyped;
							}

							if (var14 == -2147483639) {
								var14 = var0.keyPressed;
							}

							ScriptFrame.Interpreter_intLocals[var11++] = var14;
						} else if (var3[var13] instanceof String) {
							var20 = (String)var3[var13];
							if (var20.equals("event_opbase")) {
								var20 = var0.targetName;
							}

							Interpreter.Interpreter_stringLocals[var12++] = var20;
						}
					}

					Interpreter.field956 = var0.field1140;

					while (true) {
						++var10;
						if (var10 > var1) {
							throw new RuntimeException();
						}

						++var19;
						int var31 = var6[var19];
						if (var31 >= 100) {
							boolean var32;
							if (var4.intOperands[var19] == 1) {
								var32 = true;
							} else {
								var32 = false;
							}

							var14 = WorldMapLabelSize.method3158(var31, var4, var32);
							switch(var14) {
							case 0:
								return;
							case 1:
							default:
								break;
							case 2:
								throw new IllegalStateException();
							}
						} else if (var31 == 0) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7[var19];
						} else if (var31 == ScriptOpcodes.GET_VARP) {
							var13 = var7[var19];
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
						} else if (var31 == ScriptOpcodes.SET_VARP) {
							var13 = var7[var19];
							Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
							WorldMapData_0.changeGameOptions(var13);
						} else if (var31 == ScriptOpcodes.SCONST) {
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.stringOperands[var19];
						} else if (var31 == ScriptOpcodes.JUMP) {
							var19 += var7[var19];
						} else if (var31 == ScriptOpcodes.IF_ICMPNE) {
							WorldMapCacheName.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPEQ) {
							WorldMapCacheName.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPLT) {
							WorldMapCacheName.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPGT) {
							WorldMapCacheName.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.RETURN) {
							if (Interpreter.Interpreter_frameDepth == 0) {
								return;
							}

							ScriptFrame var37 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
							var4 = var37.script;
							var6 = var4.opcodes;
							var7 = var4.intOperands;
							var19 = var37.pc;
							ScriptFrame.Interpreter_intLocals = var37.intLocals;
							Interpreter.Interpreter_stringLocals = var37.stringLocals;
						} else if (var31 == ScriptOpcodes.GET_VARBIT) {
							var13 = var7[var19];
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ObjectComposition.getVarbit(var13);
						} else if (var31 == ScriptOpcodes.SET_VARBIT) {
							var13 = var7[var19];
							WorldMapRegion.method3397(var13, Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
						} else if (var31 == ScriptOpcodes.IF_ICMPLE) {
							WorldMapCacheName.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPGE) {
							WorldMapCacheName.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]) {
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.ILOAD) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ScriptFrame.Interpreter_intLocals[var7[var19]];
						} else if (var31 == ScriptOpcodes.ISTORE) {
							ScriptFrame.Interpreter_intLocals[var7[var19]] = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						} else if (var31 == ScriptOpcodes.SLOAD) {
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var19]];
						} else if (var31 == ScriptOpcodes.SSTORE) {
							Interpreter.Interpreter_stringLocals[var7[var19]] = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
						} else if (var31 == ScriptOpcodes.JOIN_STRING) {
							var13 = var7[var19];
							class13.Interpreter_stringStackSize -= var13;
							var20 = SecureRandomCallable.method2076(Interpreter.Interpreter_stringStack, class13.Interpreter_stringStackSize, var13);
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var20;
						} else if (var31 == ScriptOpcodes.POP_INT) {
							--WorldMapCacheName.Interpreter_intStackSize;
						} else if (var31 == ScriptOpcodes.POP_STRING) {
							--class13.Interpreter_stringStackSize;
						} else {
							int var17;
							if (var31 != ScriptOpcodes.INVOKE) {
								if (var31 == ScriptOpcodes.GET_VARC_INT) {
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.varcs.getInt(var7[var19]);
								} else if (var31 == ScriptOpcodes.SET_VARC_INT) {
									Client.varcs.setInt(var7[var19], Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
								} else if (var31 == ScriptOpcodes.DEFINE_ARRAY) {
									var13 = var7[var19] >> 16;
									var14 = var7[var19] & 65535;
									int var23 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
									if (var23 < 0 || var23 > 5000) {
										throw new RuntimeException();
									}

									Interpreter.Interpreter_arrayLengths[var13] = var23;
									byte var24 = -1;
									if (var14 == 105) {
										var24 = 0;
									}

									for (var17 = 0; var17 < var23; ++var17) {
										Interpreter.Interpreter_arrays[var13][var17] = var24;
									}
								} else if (var31 == ScriptOpcodes.GET_ARRAY_INT) {
									var13 = var7[var19];
									var14 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
									if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
										throw new RuntimeException();
									}

									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
								} else if (var31 == ScriptOpcodes.SET_ARRAY_INT) {
									var13 = var7[var19];
									WorldMapCacheName.Interpreter_intStackSize -= 2;
									var14 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
									if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
										throw new RuntimeException();
									}

									Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
								} else {
									String var21;
									if (var31 == ScriptOpcodes.GET_VARC_STRING_OLD) {
										var21 = Client.varcs.getStringOld(var7[var19]);
										if (var21 == null) {
											var21 = "null";
										}

										Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var21;
									} else if (var31 == ScriptOpcodes.SET_VARC_STRING_OLD) {
										Client.varcs.setStringOld(var7[var19], Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]);
									} else if (var31 == ScriptOpcodes.GET_VARC_STRING) {
										var21 = Client.varcs.getString(var7[var19]);
										Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var21;
									} else if (var31 == ScriptOpcodes.SET_VARC_STRING) {
										Client.varcs.setString(var7[var19], Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]);
									} else if (var31 == ScriptOpcodes.SWITCH) {
										IterableNodeHashTable var35 = var4.switches[var7[var19]];
										IntegerNode var34 = (IntegerNode)var35.get((long)Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
										if (var34 != null) {
											var19 += var34.integer;
										}
									} else {
										Integer var36;
										if (var31 == 74) {
											var36 = ArchiveDiskActionHandler.field3575.method152(var7[var19]);
											if (var36 == null) {
												Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var36;
											}
										} else {
											if (var31 != 76) {
												throw new IllegalStateException();
											}

											var36 = ObjectSound.field935.method5861(var7[var19]);
											if (var36 == null) {
												Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var36;
											}
										}
									}
								}
							} else {
								var13 = var7[var19];
								Script var33 = ItemComposition.getScript(var13);
								int[] var15 = new int[var33.localIntCount];
								String[] var16 = new String[var33.localStringCount];

								for (var17 = 0; var17 < var33.intArgumentCount; ++var17) {
									var15[var17] = Interpreter.Interpreter_intStack[var17 + (WorldMapCacheName.Interpreter_intStackSize - var33.intArgumentCount)];
								}

								for (var17 = 0; var17 < var33.stringArgumentCount; ++var17) {
									var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class13.Interpreter_stringStackSize - var33.stringArgumentCount)];
								}

								WorldMapCacheName.Interpreter_intStackSize -= var33.intArgumentCount;
								class13.Interpreter_stringStackSize -= var33.stringArgumentCount;
								ScriptFrame var22 = new ScriptFrame();
								var22.script = var4;
								var22.pc = var19;
								var22.intLocals = ScriptFrame.Interpreter_intLocals;
								var22.stringLocals = Interpreter.Interpreter_stringLocals;
								Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
								var4 = var33;
								var6 = var33.opcodes;
								var7 = var33.intOperands;
								var19 = -1;
								ScriptFrame.Interpreter_intLocals = var15;
								Interpreter.Interpreter_stringLocals = var16;
							}
						}
					}
				} catch (Exception var29) {
					var9 = true;
					StringBuilder var26 = new StringBuilder(30);
					var26.append("").append(var4.key).append(" ");

					for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) {
						var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
					}

					var26.append("").append(var8);
					class27.RunException_sendStackTrace(var26.toString(), var29);
				}
			} finally {
				if (Interpreter.field950) {
					Interpreter.field951 = true;
					class80.method1943();
					Interpreter.field951 = false;
					Interpreter.field950 = false;
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					class27.RunException_sendStackTrace("Warning: Script " + var4.field1054 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "448922553"
	)
	static int method4612(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
			var3 = DevicePcmPlayerProvider.getWidget(var4);
		} else {
			var3 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			WorldMapCacheName.Interpreter_intStackSize -= 2;
			var3.scrollX = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
			if (var3.scrollX > var3.scrollWidth - var3.width) {
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) {
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
			if (var3.scrollY > var3.scrollHeight - var3.height) {
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) {
				var3.scrollY = 0;
			}

			VerticalAlignment.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
			VerticalAlignment.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
			VerticalAlignment.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
			VerticalAlignment.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
			VerticalAlignment.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
			VerticalAlignment.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
			VerticalAlignment.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
			VerticalAlignment.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
			VerticalAlignment.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			WorldMapCacheName.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 5];
			VerticalAlignment.invalidateWidget(var3);
			return 1;
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
				var8 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				if (var8 != var3.sequenceId) {
					var3.sequenceId = var8;
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
					VerticalAlignment.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
				var3.modelOrthog = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
				VerticalAlignment.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
				String var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
				if (!var7.equals(var3.text)) {
					var3.text = var7;
					VerticalAlignment.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				VerticalAlignment.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				WorldMapCacheName.Interpreter_intStackSize -= 3;
				var3.textXAlignment = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var3.textYAlignment = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				var3.textLineHeight = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
				VerticalAlignment.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
				VerticalAlignment.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				VerticalAlignment.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				VerticalAlignment.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
				VerticalAlignment.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
				VerticalAlignment.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var3.scrollWidth = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var3.scrollHeight = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				VerticalAlignment.invalidateWidget(var3);
				if (var4 != -1 && var3.type == 0) {
					ApproximateRouteStrategy.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				HorizontalAlignment.resumePauseWidget(var3.id, var3.childIndex);
				Client.meslayerContinueWidget = var3;
				VerticalAlignment.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				VerticalAlignment.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				VerticalAlignment.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				VerticalAlignment.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLMODE) {
				var8 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				class393 var6 = (class393)UserComparator4.findEnumerated(class69.FillMode_values(), var8);
				if (var6 != null) {
					var3.fillMode = var6;
					VerticalAlignment.invalidateWidget(var3);
				}

				return 1;
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var5 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
					var3.field2998 = var5;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var5 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
					var3.modelTransparency = var5;
					return 1;
				} else if (var0 == 1128) {
					WorldMapCacheName.Interpreter_intStackSize -= 2;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
