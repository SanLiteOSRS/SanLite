import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("dm")
	static boolean field3108;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 652910965
	)
	@Export("width")
	int width;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1086019289
	)
	@Export("height")
	int height;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 382152447
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1356764147
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lkh;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 311
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "1552824540"
	)
	static final void method5683(PendingSpawn var0) {
		long var1 = 0L; // L: 8598
		int var3 = -1; // L: 8599
		int var4 = 0; // L: 8600
		int var5 = 0; // L: 8601
		if (var0.type == 0) { // L: 8602
			var1 = LoginType.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 8603
			var1 = LoginType.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 8604
			var1 = LoginType.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = LoginType.scene.getGroundObjectTag(var0.plane, var0.x, var0.y); // L: 8605
		}

		if (var1 != 0L) { // L: 8606
			int var6 = LoginType.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 8607
			var3 = class206.Entity_unpackID(var1); // L: 8608
			var4 = var6 & 31; // L: 8609
			var5 = var6 >> 6 & 3; // L: 8610
		}

		var0.objectId = var3; // L: 8612
		var0.field1188 = var4; // L: 8613
		var0.field1187 = var5; // L: 8614
	} // L: 8615
}
