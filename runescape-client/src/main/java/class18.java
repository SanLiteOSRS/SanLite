import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public class class18 {
	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	static PlatformInfo field92;
	@ObfuscatedName("ba")
	protected static String field89;
	@ObfuscatedName("au")
	Future field93;
	@ObfuscatedName("ae")
	String field90;

	class18(Future var1) {
		this.field93 = var1; // L: 10
	} // L: 11

	class18(String var1) {
		this.method268(var1); // L: 14
	} // L: 15

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1898504795"
	)
	void method268(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field90 = var1; // L: 19
		if (this.field93 != null) { // L: 20
			this.field93.cancel(true); // L: 21
			this.field93 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-197315393"
	)
	public final String method286() {
		return this.field90; // L: 27
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2089695473"
	)
	public boolean method276() {
		return this.field90 != null || this.field93 == null; // L: 31
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public final boolean method271() {
		return this.method276() ? true : this.field93.isDone(); // L: 35 36
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Las;",
		garbageValue = "626026127"
	)
	public final class20 method281() {
		if (this.method276()) { // L: 40
			return new class20(this.field90);
		} else if (!this.method271()) { // L: 41
			return null;
		} else {
			try {
				return (class20)this.field93.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3);
				this.method268(var2);
				return new class20(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1969917926"
	)
	public static void method291() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 47
	} // L: 48

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)Lch;",
		garbageValue = "9992"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 238
		return VarcInt.getNextWorldListWorld(); // L: 239
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "94"
	)
	static void method288() {
		class27.field144 = System.getenv("JX_ACCESS_TOKEN"); // L: 932
		class9.field40 = System.getenv("JX_REFRESH_TOKEN"); // L: 933
		class157.field1762 = System.getenv("JX_SESSION_ID"); // L: 934
		Varcs.field1416 = System.getenv("JX_CHARACTER_ID"); // L: 935
		class478.method8456(System.getenv("JX_DISPLAY_NAME")); // L: 936
	} // L: 937

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1303959829"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5713
		int var4 = var1 >> 7; // L: 5714
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5715
			int var5 = var2; // L: 5716
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5717
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5718
			int var7 = var1 & 127; // L: 5719
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7; // L: 5720
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7; // L: 5721
			return var9 * var7 + var8 * (128 - var7) >> 7; // L: 5722
		} else {
			return 0;
		}
	}
}
