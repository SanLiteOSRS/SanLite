import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tu")
public class class514 implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	public static final class514 field5065;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	public static final class514 field5066;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	public static final class514 field5061;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field5059;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1834723601
	)
	public final int field5060;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1386698711
	)
	public final int field5063;
	@ObfuscatedName("au")
	public final Class field5064;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	public final class510 field5062;

	static {
		field5065 = new class514(0, 0, Integer.class, new class511()); // L: 10
		field5066 = new class514(1, 1, Long.class, new class513()); // L: 24
		field5061 = new class514(2, 2, String.class, new class515()); // L: 38
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Ltc;)V"
	)
	class514(int var1, int var2, Class var3, class510 var4) {
		this.field5060 = var1; // L: 62
		this.field5063 = var2; // L: 63
		this.field5064 = var3; // L: 64
		this.field5062 = var4; // L: 65
	} // L: 66

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5063; // L: 83
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)Ljava/lang/Object;",
		garbageValue = "-2037622624"
	)
	public Object method9120(Buffer var1) {
		return this.field5062.vmethod9141(var1); // L: 87
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltu;",
		garbageValue = "-2123619619"
	)
	public static class514[] method9122() {
		return new class514[]{field5065, field5066, field5061}; // L: 58
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Ltu;",
		garbageValue = "5"
	)
	public static class514 method9124(Class var0) {
		class514[] var1 = method9122(); // L: 70

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 71
			class514 var3 = var1[var2]; // L: 72
			if (var3.field5064 == var0) {
				return var3; // L: 74
			}
		}

		return null; // L: 78
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "-5207"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5652
			int var3 = WorldMapDecorationType.getTileHeight(var0, var1, ItemLayer.Client_plane) - var2; // L: 5657
			var0 -= ViewportMouse.cameraX; // L: 5658
			var3 -= SecureRandomFuture.cameraY; // L: 5659
			var1 -= class36.cameraZ; // L: 5660
			int var4 = Rasterizer3D.Rasterizer3D_sine[Varcs.cameraPitch]; // L: 5661
			int var5 = Rasterizer3D.Rasterizer3D_cosine[Varcs.cameraPitch]; // L: 5662
			int var6 = Rasterizer3D.Rasterizer3D_sine[class192.cameraYaw]; // L: 5663
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class192.cameraYaw]; // L: 5664
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5665
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5666
			var0 = var8; // L: 5667
			var8 = var3 * var5 - var4 * var1 >> 16; // L: 5668
			var1 = var5 * var1 + var4 * var3 >> 16; // L: 5669
			if (var1 >= 50) { // L: 5671
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5672
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 5673
			} else {
				Client.viewportTempX = -1; // L: 5676
				Client.viewportTempY = -1; // L: 5677
			}

		} else {
			Client.viewportTempX = -1; // L: 5653
			Client.viewportTempY = -1; // L: 5654
		}
	} // L: 5655 5679

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "38"
	)
	static final boolean method9121(int var0) {
		if (var0 < 0) { // L: 9495
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 9496
			if (var1 >= 2000) { // L: 9497
				var1 -= 2000;
			}

			return var1 == 1007; // L: 9498
		}
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1571518188"
	)
	static final void method9131(int var0, int var1) {
		if (HealthBarDefinition.field1877.method6282(var0)) { // L: 12048
			UserComparator5.runComponentCloseListeners(HealthBarDefinition.field1877.field3568[var0], var1); // L: 12049
		}
	} // L: 12050
}
