import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class1 implements Callable {
	@ObfuscatedName("hk")
	static int[] field0;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	final Buffer field1;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final class3 field2;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Laz;Luq;Lai;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field1 = var2;
		this.field2 = var3;
	}

	public Object call() {
		return this.field2.vmethod14(this.field1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lun;I)V",
		garbageValue = "-1777404820"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 38
		int var1 = Client.localPlayerIndex;
		Player var2 = VarpDefinition.localPlayer = Client.players[var1] = new Player();
		var2.index = var1;
		int var3 = var0.readBits(30);
		byte var4 = (byte)(var3 >> 28); // L: 43
		int var5 = var3 >> 14 & 16383;
		int var6 = var3 & 16383;
		var2.pathX[0] = var5 - Projectile.baseX * 64;
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
		var2.pathY[0] = var6 - GameEngine.baseY * 8;
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
		class473.Client_plane = var2.plane = var4; // L: 50
		if (Players.field1389[var1] != null) {
			var2.read(Players.field1389[var1]);
		}

		Players.Players_count = 0;
		Players.Players_indices[++Players.Players_count - 1] = var1;
		Players.field1379[var1] = 0; // L: 54
		Players.Players_emptyIdxCount = 0;

		for (int var7 = 1; var7 < 2048; ++var7) {
			if (var7 != var1) { // L: 57
				int var8 = var0.readBits(18);
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 597;
				int var11 = var8 & 597; // L: 61
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 62
				Players.Players_orientations[var7] = 0; // L: 63
				Players.Players_targetIndices[var7] = -1; // L: 64
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 65
				Players.field1379[var7] = 0; // L: 66
			}
		}

		var0.exportIndex(); // L: 68
	} // L: 69

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-57"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IZIZB)V",
		garbageValue = "125"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (WorldMapID.World_worlds != null) { // L: 172
			WorldMapSectionType.doWorldSorting(0, WorldMapID.World_worlds.length - 1, var0, var1, var2, var3); // L: 173
		}

	} // L: 175
}
