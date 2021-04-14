import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class22 extends class14 {
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		signature = "Loh;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -406476963
	)
	int field173;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		signature = "(Lu;)V"
	)
	class22(class2 var1) {
		this.this$0 = var1;
		this.field173 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field173 = var1.readUnsignedShort();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method147(this.field173);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-500170582"
	)
	static int method328(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1);
		return class208.NetCache_currentResponse != null && class208.NetCache_currentResponse.key == var2 ? InterfaceParent.NetCache_responseArchiveBuffer.offset * 99 / (InterfaceParent.NetCache_responseArchiveBuffer.array.length - class208.NetCache_currentResponse.padding) + 1 : 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "34"
	)
	public static void method320() {
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		signature = "(Lcd;I)V",
		garbageValue = "543264748"
	)
	static final void method330(Actor var0) {
		var0.movementSequence = var0.readySequence;
		if (var0.pathLength == 0) {
			var0.field1267 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = class225.SequenceDefinition_get(var0.sequence);
				if (var0.field1224 > 0 && var1.field3722 == 0) {
					++var0.field1267;
					return;
				}

				if (var0.field1224 <= 0 && var1.field3723 == 0) {
					++var0.field1267;
					return;
				}
			}

			int var10 = var0.x;
			int var2 = var0.y;
			int var3 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1258 * 64;
			int var4 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1258 * 64;
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
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1262 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1267 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1267;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1267 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1267;
					}
				}

				if (var5 == 2) {
					var8 <<= 1;
				}

				if (var8 >= 8 && var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
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
					if (var0.field1224 > 0) {
						--var0.field1224;
					}
				}

			} else {
				var0.x = var3;
				var0.y = var4;
				--var0.pathLength;
				if (var0.field1224 > 0) {
					--var0.field1224;
				}

			}
		}
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		signature = "(IIIIIIIB)V",
		garbageValue = "40"
	)
	static final void method329(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334;
		if (var8 < 0) {
			var8 = 0;
		} else if (var8 > 100) {
			var8 = 100;
		}

		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight;
		int var7 = var5 * var9 / 256;
		var8 = 2048 - var3 & 2047;
		var9 = 2048 - var4 & 2047;
		int var10 = 0;
		int var11 = 0;
		int var12 = var7;
		int var13;
		int var14;
		int var15;
		if (var8 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var8];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var15 = var14 * var11 - var13 * var7 >> 16;
			var12 = var13 * var11 + var14 * var7 >> 16;
			var11 = var15;
		}

		if (var9 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var9];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9];
			var15 = var13 * var12 + var10 * var14 >> 16;
			var12 = var14 * var12 - var10 * var13 >> 16;
			var10 = var15;
		}

		ModeWhere.cameraX = var0 - var10;
		WorldMapRectangle.cameraY = var1 - var11;
		ReflectionCheck.cameraZ = var2 - var12;
		WorldMapArea.cameraPitch = var3;
		class69.cameraYaw = var4;
		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class6.oculusOrbFocalPointX >> 7 != Varcs.localPlayer.x >> 7 || Players.oculusOrbFocalPointY >> 7 != Varcs.localPlayer.y >> 7)) {
			var13 = Varcs.localPlayer.plane;
			var14 = ItemLayer.baseX * 64 + (class6.oculusOrbFocalPointX >> 7);
			var15 = Tile.baseY * 64 + (Players.oculusOrbFocalPointY >> 7);
			class9.method123(var14, var15, var13, true);
		}

	}
}
