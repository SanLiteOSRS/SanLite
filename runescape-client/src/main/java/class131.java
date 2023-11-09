import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class131 {
	@ObfuscatedName("hz")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 7802385156606399349L
	)
	long field1565;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2103686763
	)
	int field1555;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	IterableNodeDeque field1556;

	@ObfuscatedSignature(
		descriptor = "(Lqw;)V"
	)
	public class131(Buffer var1) {
		this.field1555 = -1; // L: 9
		this.field1556 = new IterableNodeDeque(); // L: 10
		this.method2917(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "1289966239"
	)
	void method2917(Buffer var1) {
		this.field1565 = var1.readLong();
		this.field1555 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class150(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class126(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class143(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class135(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class142(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class127(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class132(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class125(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class129(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class146(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class152(this);
			} else if (var2 == 10) {
				var3 = new class138(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class133(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class137(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class147(this);
			}

			((class128)var3).vmethod3155(var1); // L: 53
			this.field1556.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "1189729405"
	)
	public void method2911(ClanSettings var1) {
		if (var1.field1613 == this.field1565 && this.field1555 == var1.field1614) { // L: 60
			for (class128 var2 = (class128)this.field1556.last(); var2 != null; var2 = (class128)this.field1556.previous()) { // L: 61
				var2.vmethod3154(var1); // L: 62
			}

			++var1.field1614; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "-15"
	)
	public static final synchronized long method2916() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class269.field3174) { // L: 15
			FriendSystem.field797 += class269.field3174 - var0; // L: 16
		}

		class269.field3174 = var0; // L: 18
		return var0 + FriendSystem.field797; // L: 19
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfh;",
		garbageValue = "45"
	)
	public static FloorUnderlayDefinition method2909(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0); // L: 27
			var1 = new FloorUnderlayDefinition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 30
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Lcs;I)V",
		garbageValue = "2018308551"
	)
	static final void method2913(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 4116
		if (var0.pathLength == 0) { // L: 4117
			var0.field1142 = 0; // L: 4118
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4121
				SequenceDefinition var1 = class14.SequenceDefinition_get(var0.sequence); // L: 4122
				if (var0.field1203 > 0 && var1.field2173 == 0) { // L: 4123
					++var0.field1142; // L: 4124
					return; // L: 4125
				}

				if (var0.field1203 <= 0 && var1.field2156 == 0) { // L: 4127
					++var0.field1142; // L: 4128
					return; // L: 4129
				}
			}

			int var10 = var0.x; // L: 4132
			int var2 = var0.y; // L: 4133
			int var3 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1202 * 64; // L: 4134
			int var4 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1202 * 64; // L: 4135
			if (var10 < var3) { // L: 4136
				if (var2 < var4) { // L: 4137
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 4138
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 4139
				}
			} else if (var10 > var3) { // L: 4141
				if (var2 < var4) { // L: 4142
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 4143
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 4144
				}
			} else if (var2 < var4) { // L: 4146
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 4147
				var0.orientation = 0;
			}

			class192 var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 4148
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 4149
				int var6 = var0.orientation - var0.rotation & 2047; // L: 4156
				if (var6 > 1024) { // L: 4157
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 4158
				if (var6 >= -256 && var6 <= 256) { // L: 4159
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 4160
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 4161
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) {
					var7 = var0.walkSequence; // L: 4162
				}

				var0.movementSequence = var7; // L: 4163
				int var8 = 4; // L: 4164
				boolean var9 = true; // L: 4165
				if (var0 instanceof NPC) { // L: 4166
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 4167
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1197 != 0) { // L: 4168
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 4169
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 4170
						var8 = 8;
					}

					if (var0.field1142 > 0 && var0.pathLength > 1) { // L: 4171
						var8 = 8; // L: 4172
						--var0.field1142; // L: 4173
					}
				} else {
					if (var0.pathLength > 1) { // L: 4177
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 4178
						var8 = 8;
					}

					if (var0.field1142 > 0 && var0.pathLength > 1) { // L: 4179
						var8 = 8; // L: 4180
						--var0.field1142; // L: 4181
					}
				}

				if (var5 == class192.field2197) { // L: 4184
					var8 <<= 1;
				} else if (var5 == class192.field2195) { // L: 4185
					var8 >>= 1;
				}

				if (var8 >= 8) { // L: 4186
					if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 4187
						var0.movementSequence = var0.runSequence;
					} else if (var0.walkBackSequence == var0.movementSequence && var0.field1199 != -1) { // L: 4188
						var0.movementSequence = var0.field1199;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1143 != -1) {
						var0.movementSequence = var0.field1143; // L: 4189
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1144 != -1) { // L: 4190
						var0.movementSequence = var0.field1144;
					}
				} else if (var8 <= 1) { // L: 4192
					if (var0.movementSequence == var0.walkSequence && var0.field1145 != -1) { // L: 4193
						var0.movementSequence = var0.field1145;
					} else if (var0.walkBackSequence == var0.movementSequence && var0.field1146 != -1) { // L: 4194
						var0.movementSequence = var0.field1146;
					} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1147 != -1) { // L: 4195
						var0.movementSequence = var0.field1147;
					} else if (var0.movementSequence == var0.walkRightSequence && var0.field1148 != -1) { // L: 4196
						var0.movementSequence = var0.field1148;
					}
				}

				if (var10 != var3 || var4 != var2) { // L: 4198
					if (var10 < var3) { // L: 4199
						var0.x += var8; // L: 4200
						if (var0.x > var3) { // L: 4201
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 4203
						var0.x -= var8; // L: 4204
						if (var0.x < var3) { // L: 4205
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 4207
						var0.y += var8; // L: 4208
						if (var0.y > var4) { // L: 4209
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 4211
						var0.y -= var8; // L: 4212
						if (var0.y < var4) { // L: 4213
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 4216
					--var0.pathLength; // L: 4217
					if (var0.field1203 > 0) { // L: 4218
						--var0.field1203;
					}
				}

			} else {
				var0.x = var3; // L: 4150
				var0.y = var4; // L: 4151
				--var0.pathLength; // L: 4152
				if (var0.field1203 > 0) { // L: 4153
					--var0.field1203;
				}

			}
		}
	} // L: 4119 4154 4220
}
