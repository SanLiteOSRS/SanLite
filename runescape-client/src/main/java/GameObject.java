import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1406588919
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 903979213
	)
	@Export("z")
	int z;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1936995303
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1834904139
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2016007957
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -873123859
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -460248005
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -857619617
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1093355515
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 35503397
	)
	int field3134;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1238217845
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = -1518418869526017207L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -13334823
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-41"
	)
	static final void method5901(int var0, int var1, int var2) {
		if (GameEngine.cameraX < var0) { // L: 4033
			GameEngine.cameraX = (var0 - GameEngine.cameraX) * class380.field4416 / 1000 + GameEngine.cameraX + HealthBarDefinition.field1890; // L: 4034
			if (GameEngine.cameraX > var0) { // L: 4035
				GameEngine.cameraX = var0;
			}
		}

		if (GameEngine.cameraX > var0) { // L: 4037
			GameEngine.cameraX -= (GameEngine.cameraX - var0) * class380.field4416 / 1000 + HealthBarDefinition.field1890; // L: 4038
			if (GameEngine.cameraX < var0) { // L: 4039
				GameEngine.cameraX = var0;
			}
		}

		if (KeyHandler.cameraY < var1) { // L: 4041
			KeyHandler.cameraY = (var1 - KeyHandler.cameraY) * class380.field4416 / 1000 + KeyHandler.cameraY + HealthBarDefinition.field1890; // L: 4042
			if (KeyHandler.cameraY > var1) { // L: 4043
				KeyHandler.cameraY = var1;
			}
		}

		if (KeyHandler.cameraY > var1) { // L: 4045
			KeyHandler.cameraY -= (KeyHandler.cameraY - var1) * class380.field4416 / 1000 + HealthBarDefinition.field1890; // L: 4046
			if (KeyHandler.cameraY < var1) { // L: 4047
				KeyHandler.cameraY = var1;
			}
		}

		if (GrandExchangeOfferTotalQuantityComparator.cameraZ < var2) { // L: 4049
			GrandExchangeOfferTotalQuantityComparator.cameraZ = (var2 - GrandExchangeOfferTotalQuantityComparator.cameraZ) * class380.field4416 / 1000 + GrandExchangeOfferTotalQuantityComparator.cameraZ + HealthBarDefinition.field1890; // L: 4050
			if (GrandExchangeOfferTotalQuantityComparator.cameraZ > var2) { // L: 4051
				GrandExchangeOfferTotalQuantityComparator.cameraZ = var2;
			}
		}

		if (GrandExchangeOfferTotalQuantityComparator.cameraZ > var2) { // L: 4053
			GrandExchangeOfferTotalQuantityComparator.cameraZ -= (GrandExchangeOfferTotalQuantityComparator.cameraZ - var2) * class380.field4416 / 1000 + HealthBarDefinition.field1890; // L: 4054
			if (GrandExchangeOfferTotalQuantityComparator.cameraZ < var2) { // L: 4055
				GrandExchangeOfferTotalQuantityComparator.cameraZ = var2;
			}
		}

	} // L: 4057
}
