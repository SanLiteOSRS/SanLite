import java.awt.Component;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bz")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 804110336
	)
	static int field448;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1271809059
	)
	public static int field446;
	@ObfuscatedName("ez")
	static int[] field438;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256);
		this.rawSounds = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.musicSampleIndex = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Lar;",
		garbageValue = "58"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				var7 = var8.toRawSound();
				this.rawSounds.put(var7, var5);
				if (var3 != null) {
					var3[0] -= var7.samples.length;
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lar;",
		garbageValue = "822692099"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4 ^ 4294967296L;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5);
			if (var8 == null) {
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2);
				if (var8 == null) {
					return null;
				}

				this.musicSamples.put(var8, var5);
			}

			var7 = var8.toRawSound(var3);
			if (var7 == null) {
				return null;
			} else {
				var8.remove();
				this.rawSounds.put(var7, var5);
				return var7;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lar;",
		garbageValue = "-2090630447"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lar;",
		garbageValue = "-1103543677"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) {
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-55"
	)
	static void method932(Component var0) {
		var0.setFocusTraversalKeysEnabled(false);
		var0.addKeyListener(KeyHandler.KeyHandler_instance);
		var0.addFocusListener(KeyHandler.KeyHandler_instance);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1363768741"
	)
	static void method928() {
		Players.Players_count = 0;

		for (int var0 = 0; var0 < 2048; ++var0) {
			Players.field1362[var0] = null;
			Players.field1361[var0] = 1;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-943679526"
	)
	static int method929(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
			var9 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3 + var9;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				UserComparator9.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
				var9 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3 + HealthBarDefinition.intToString(var9, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					long var13 = ((long)var10 + 11745L) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var13));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = Integer.toString(var10);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						UserComparator9.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class269.method5000(class226.compareStrings(Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize + 1], AbstractArchive.clientLanguage));
						return 1;
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
							ChatChannel.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
							var11 = GrandExchangeOfferOwnWorldComparator.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
							ChatChannel.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
							var11 = GrandExchangeOfferOwnWorldComparator.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							UserComparator9.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3 + (char)var9;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = GameBuild.isCharPrintable((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DynamicObject.isAlphaNumeric((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = HitSplatDefinition.isCharAlphabetic((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class105.isDigit((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
							ChatChannel.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.substring(var9, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
							StringBuilder var15 = new StringBuilder(var3.length());
							boolean var16 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var16 = true;
								} else if (var7 == '>') {
									var16 = false;
								} else if (!var16) {
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var15.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.indexOf(var9);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							UserComparator9.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize + 1];
							var5 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.UPPERCASE) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					UserComparator9.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize + 1];
					if (class262.localPlayer.appearance != null && class262.localPlayer.appearance.isFemale) {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Lcl;B)V",
		garbageValue = "-11"
	)
	static final void method930(Actor var0) {
		var0.movementSequence = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field1242 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = WorldMapScaleHandler.SequenceDefinition_get(var0.sequence);
				if (var0.field1281 > 0 && var1.field1895 == 0) {
					++var0.field1242;
					return;
				}

				if (var0.field1281 <= 0 && var1.field1893 == 0) {
					++var0.field1242;
					return;
				}
			}

			int var10 = var0.x;
			int var2 = var0.y;
			int var3 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1225 * 64;
			int var4 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1225 * 64;
			if (var10 < var3) {
				if (var2 < var4) {
					var0.orientation = 1280;
				} else if (var2 > var4) {
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536;
				}
			} else if (var10 > var3) {
				if (var2 < var4) {
					var0.orientation = 768;
				} else if (var2 > var4) {
					var0.orientation = 256;
				} else {
					var0.orientation = 512;
				}
			} else if (var2 < var4) {
				var0.orientation = 1024;
			} else if (var2 > var4) {
				var0.orientation = 0;
			}

			byte var5 = var0.pathTraversed[var0.pathLength - 1];
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
				int var6 = var0.orientation - var0.rotation & 2047;
				if (var6 > 1024) {
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence;
				if (var6 >= -256 && var6 <= 256) {
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) {
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) {
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) {
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7;
				int var8 = 4;
				boolean var9 = true;
				if (var0 instanceof NPC) {
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) {
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1275 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1242 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1242;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1242 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1242;
					}
				}

				if (var5 == 2) {
					var8 <<= 1;
				}

				if (var8 >= 8 && var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
					var0.movementSequence = var0.runSequence;
				}

				if (var10 != var3 || var2 != var4) {
					if (var10 < var3) {
						var0.x += var8;
						if (var0.x > var3) {
							var0.x = var3;
						}
					} else if (var10 > var3) {
						var0.x -= var8;
						if (var0.x < var3) {
							var0.x = var3;
						}
					}

					if (var2 < var4) {
						var0.y += var8;
						if (var0.y > var4) {
							var0.y = var4;
						}
					} else if (var2 > var4) {
						var0.y -= var8;
						if (var0.y < var4) {
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) {
					--var0.pathLength;
					if (var0.field1281 > 0) {
						--var0.field1281;
					}
				}

			} else {
				var0.x = var3;
				var0.y = var4;
				--var0.pathLength;
				if (var0.field1281 > 0) {
					--var0.field1281;
				}

			}
		}
	}
}
