import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	static class353 field1210;
	@ObfuscatedName("n")
	@Export("cacheParentPaths")
	static String[] cacheParentPaths;
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "[Ljf;"
	)
	static Widget[] field1207;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("definition")
	NPCComposition definition;

	NPC() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IBI)V",
		garbageValue = "-1295452505"
	)
	final void method2258(int var1, byte var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (super.sequence != -1 && MouseHandler.SequenceDefinition_get(super.sequence).field1956 == 1) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhl;",
		garbageValue = "461766541"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? MouseHandler.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || super.idleSequence == super.movementSequence && var1 != null ? null : MouseHandler.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					Model var4 = BZip2State.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1126, 0);
						Model[] var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
					}
				}

				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-124"
	)
	final void method2249(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && MouseHandler.SequenceDefinition_get(super.sequence).field1956 == 1) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = 1;
				return;
			}
		}

		super.pathLength = 0;
		super.field1144 = 0;
		super.field1085 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1087 * 1304956928 + super.pathX[0] * 128;
		super.y = super.field1087 * 1304956928 + super.pathY[0] * 128;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-532391824"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lnf;III)I",
		garbageValue = "2110206967"
	)
	static int method2251(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "569144046"
	)
	public static void method2248() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1285705264"
	)
	static final boolean method2265(int var0, int var1) {
		ObjectComposition var2 = KitDefinition.getObjectDefinition(var0);
		if (var1 == 11) {
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}

		return var2.method3305(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIS)I",
		garbageValue = "-944"
	)
	public static int method2256(byte[] var0, int var1) {
		int var3 = -1;

		for (int var4 = 0; var4 < var1; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}
}
