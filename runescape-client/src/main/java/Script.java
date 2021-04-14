import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		signature = "[Loh;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("o")
	String field1058;
	@ObfuscatedName("u")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("p")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("b")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1191660215
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -49303827
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 162609675
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1127748469
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "[Lme;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IB)[Lme;",
		garbageValue = "0"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1090805477"
	)
	static void method2010() {
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(IIII)I",
		garbageValue = "-1768640956"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "-710644137"
	)
	static int method1998(int var0, Script var1, boolean var2) {
		if (var0 == 3800) {
			if (ObjectSound.field928 != null) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1;
				class19.field154 = ObjectSound.field928;
			} else {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == 3801) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				if (Client.field831[var3] != null) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1;
					class19.field154 = Client.field831[var3];
				} else {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == 3802) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class19.field154.field81;
				return 1;
			} else if (var0 == 3803) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field90 ? 1 : 0;
				return 1;
			} else if (var0 == 3804) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field84;
				return 1;
			} else if (var0 == 3805) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field83;
				return 1;
			} else if (var0 == 3806) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field86;
				return 1;
			} else if (var0 == 3807) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field87;
				return 1;
			} else if (var0 == 3809) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field88;
				return 1;
			} else if (var0 == 3810) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class19.field154.field99[var3];
				return 1;
			} else if (var0 == 3811) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field76[var3];
				return 1;
			} else if (var0 == 3812) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field97;
				return 1;
			} else if (var0 == 3813) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class19.field154.field105[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == 3814) {
					class16.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.method143(var3, var6, var5);
					return 1;
				} else if (var0 == 3815) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field100;
					return 1;
				} else if (var0 == 3816) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field96;
					return 1;
				} else if (var0 == 3817) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.method142(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == 3818) {
					Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize - 1] = class19.field154.method159()[Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == 3819) {
					class16.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
					ClientPacket.method3885(var6, var3);
					return 1;
				} else if (var0 == 3820) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field94[var3];
					return 1;
				} else {
					if (var0 == 3821) {
						class16.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
						class4.method75(var5, var3, var4);
					}

					if (var0 == 3822) {
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field78[var3] ? 1 : 0;
						return 1;
					} else if (var0 == 3850) {
						if (IsaacCipher.field4266 != null) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1;
							Interpreter.field941 = IsaacCipher.field4266;
						} else {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == 3851) {
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						if (Client.field820[var3] != null) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1;
							Interpreter.field941 = Client.field820[var3];
							class25.field197 = var3;
						} else {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == 3852) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Interpreter.field941.field25;
						return 1;
					} else if (var0 == 3853) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Interpreter.field941.field30;
						return 1;
					} else if (var0 == 3854) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Interpreter.field941.field31;
						return 1;
					} else if (var0 == 3855) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Interpreter.field941.method46();
						return 1;
					} else if (var0 == 3856) {
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ((class9)Interpreter.field941.field27.get(var3)).field65;
						return 1;
					} else if (var0 == 3857) {
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ((class9)Interpreter.field941.field27.get(var3)).field66;
						return 1;
					} else if (var0 == 3858) {
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ((class9)Interpreter.field941.field27.get(var3)).field64;
						return 1;
					} else if (var0 == 3859) {
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						GraphicsObject.method1913(class25.field197, var3);
						return 1;
					} else if (var0 == 3860) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Interpreter.field941.method43(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == 3861) {
						Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize - 1] = Interpreter.field941.method44()[Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == 3890) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Coord.field2591 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
