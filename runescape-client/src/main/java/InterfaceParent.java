import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("a")
	@Export("cacheParentPaths")
	public static String[] cacheParentPaths;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 897280301
	)
	@Export("group")
	int group;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1329352515
	)
	@Export("type")
	int type;
	@ObfuscatedName("f")
	boolean field1165;

	InterfaceParent() {
		this.field1165 = false;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Ler;",
		garbageValue = "-647978763"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Lcy;I)V",
		garbageValue = "-1452736307"
	)
	static final void method2083(Actor var0) {
		var0.movementSequence = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field1294 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = LoginScreenAnimation.SequenceDefinition_get(var0.sequence);
				if (var0.field1274 > 0 && var1.field1883 == 0) {
					++var0.field1294;
					return;
				}

				if (var0.field1274 <= 0 && var1.field1890 == 0) {
					++var0.field1294;
					return;
				}
			}

			int var10 = var0.x;
			int var2 = var0.y;
			int var3 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1239 * 64;
			int var4 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1239 * 64;
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
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1289 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1294 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1294;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1294 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1294;
					}
				}

				if (var5 == 2) {
					var8 <<= 1;
				}

				if (var8 >= 8 && var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
					var0.movementSequence = var0.runSequence;
				}

				if (var3 != var10 || var4 != var2) {
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
					if (var0.field1274 > 0) {
						--var0.field1274;
					}
				}

			} else {
				var0.x = var3;
				var0.y = var4;
				--var0.pathLength;
				if (var0.field1274 > 0) {
					--var0.field1274;
				}

			}
		}
	}

	@ObfuscatedName("je")
	static final void method2082(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0);
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0);
		Decimator.method1073();
		ObjectComposition.clientPreferences.field1337 = var0;
		TileItem.savePreferences();
	}
}
