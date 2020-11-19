import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		signature = "[Lle;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1412668883
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1556347637
	)
	@Export("height")
	int height;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 954361615
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1596359689
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lej;"
	)
	@Export("entity")
	public Renderable entity;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1994666041
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 207668277
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1940452637
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1266358135
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1643778515
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 609082727
	)
	int field1962;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -404331619
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -2637081015005136759L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -735597717
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1929394434"
	)
	public static boolean method3416(int var0) {
		return var0 >= WorldMapDecorationType.field2766.id && var0 <= WorldMapDecorationType.field2767.id;
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		signature = "(Lcs;I)V",
		garbageValue = "-755652962"
	)
	static final void method3415(Actor var0) {
		if (var0.field1028 != 0) {
			if (var0.targetIndex != -1) {
				Object var1 = null;
				if (var0.targetIndex < 32768) {
					var1 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var1 = Client.players[var0.targetIndex - 32768];
				}

				if (var1 != null) {
					int var2 = var0.x - ((Actor)var1).x;
					int var3 = var0.y - ((Actor)var1).y;
					if (var2 != 0 || var3 != 0) {
						var0.orientation = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}

			if (var0.field1003 != -1 && (var0.pathLength == 0 || var0.field978 > 0)) {
				var0.orientation = var0.field1003;
				var0.field1003 = -1;
			}

			int var4 = var0.orientation - var0.rotation & 2047;
			if (var4 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			if (var4 != 0) {
				++var0.field1027;
				boolean var6;
				if (var4 > 1024) {
					var0.rotation -= var0.field1028;
					var6 = true;
					if (var4 < var0.field1028 || var4 > 2048 - var0.field1028) {
						var0.rotation = var0.orientation;
						var6 = false;
					}

					if (var0.readySequence == var0.movementSequence && (var0.field1027 > 25 || var6)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += var0.field1028;
					var6 = true;
					if (var4 < var0.field1028 || var4 > 2048 - var0.field1028) {
						var0.rotation = var0.orientation;
						var6 = false;
					}

					if (var0.readySequence == var0.movementSequence && (var0.field1027 > 25 || var6)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}

				var0.rotation &= 2047;
			} else {
				var0.field1027 = 0;
			}

		}
	}
}
