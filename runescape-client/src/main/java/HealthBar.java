import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -74001321
	)
	@Export("ItemComposition_fileCount")
	public static int ItemComposition_fileCount;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 860411603
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = 1873768041
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lhl;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return; // L: 25
			}

			if (var7.cycle <= var1) {
				var5 = var7; // L: 27
			}
		}

		if (var5 == null) { // L: 29
			if (var6 < 4) { // L: 30
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove(); // L: 34
			}

		}
	} // L: 31 35

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldo;",
		garbageValue = "-93"
	)
	@Export("getInventorySprite")
	HealthBarUpdate getInventorySprite(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-45"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method7032(); // L: 55
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1142010157"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5683
			int var3 = class18.getTileHeight(var0, var1, Client_plane) - var2; // L: 5688
			var0 -= NPCComposition.cameraX; // L: 5689
			var3 -= class133.cameraY; // L: 5690
			var1 -= class139.cameraZ; // L: 5691
			int var4 = Rasterizer3D.Rasterizer3D_sine[class129.cameraPitch]; // L: 5692
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class129.cameraPitch]; // L: 5693
			int var6 = Rasterizer3D.Rasterizer3D_sine[UserComparator10.cameraYaw]; // L: 5694
			int var7 = Rasterizer3D.Rasterizer3D_cosine[UserComparator10.cameraYaw]; // L: 5695
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5696
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5697
			var0 = var8; // L: 5698
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5699
			var1 = var5 * var1 + var3 * var4 >> 16; // L: 5700
			if (var1 >= 50) { // L: 5702
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5703
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1; // L: 5704
			} else {
				Client.viewportTempX = -1; // L: 5707
				Client.viewportTempY = -1; // L: 5708
			}

		} else {
			Client.viewportTempX = -1; // L: 5684
			Client.viewportTempY = -1; // L: 5685
		}
	} // L: 5686 5710
}
