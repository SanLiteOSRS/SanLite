import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class138 extends class116 {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 449318605468420723L
	)
	long field1525;
	@ObfuscatedName("w")
	String field1524;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class138(class119 var1) {
		this.this$0 = var1;
		this.field1525 = -1L;
		this.field1524 = null;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1525 = var1.readLong();
		}

		this.field1524 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2658(this.field1525, this.field1524);
	}

	@ObfuscatedName("a")
	public static int method2827(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)V",
		garbageValue = "-1003389326"
	)
	static final void method2836(Actor var0) {
		var0.movementSequence = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field1085 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = MouseHandler.SequenceDefinition_get(var0.sequence);
				if (var0.field1144 > 0 && var1.field1963 == 0) {
					++var0.field1085;
					return;
				}

				if (var0.field1144 <= 0 && var1.field1956 == 0) {
					++var0.field1085;
					return;
				}
			}

			int var10 = var0.x;
			int var2 = var0.y;
			int var3 = var0.field1087 * 1304956928 + var0.pathX[var0.pathLength - 1] * 128;
			int var4 = var0.field1087 * 1304956928 + var0.pathY[var0.pathLength - 1] * 128;
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
					if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1138 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1085 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1085;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1085 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1085;
					}
				}

				if (var5 == 2) {
					var8 <<= 1;
				}

				if (var8 >= 8 && var0.walkSequence == var0.movementSequence && var0.runSequence != -1) {
					var0.movementSequence = var0.runSequence;
				}

				if (var10 != var3 || var4 != var2) {
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
					if (var0.field1144 > 0) {
						--var0.field1144;
					}
				}

			} else {
				var0.x = var3;
				var0.y = var4;
				--var0.pathLength;
				if (var0.field1144 > 0) {
					--var0.field1144;
				}

			}
		}
	}
}
