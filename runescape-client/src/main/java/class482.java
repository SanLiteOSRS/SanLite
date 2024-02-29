import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sv")
public class class482 implements class480 {
	@ObfuscatedName("aq")
	final Map field4886;

	public class482(Map var1) {
		this.field4886 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lsp;",
		garbageValue = "46"
	)
	public class479 vmethod8780() {
		return null; // L: 16
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-62513224"
	)
	public byte[] vmethod8781() throws UnsupportedEncodingException {
		return this.method8783().getBytes("UTF-8"); // L: 21
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "116"
	)
	public String method8783() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder(); // L: 25
		Iterator var2 = this.field4886.entrySet().iterator(); // L: 26

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 27
			String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8"); // L: 29
			String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8"); // L: 30
			var1.append(var4).append("=").append(var5).append("&"); // L: 31
		}

		if (var1.length() == 0) { // L: 34
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1); // L: 35
			var1.insert(0, "?"); // L: 36
			return var1.toString(); // L: 37
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Liz;B)V",
		garbageValue = "2"
	)
	static final void method8782(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 90
			for (var7 = 0; var7 < 64; ++var7) { // L: 91
				for (var8 = 0; var8 < 64; ++var8) { // L: 92
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 93
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var2 + var8] &= -16777217;
					}
				}
			}
		}

		Buffer var12 = new Buffer(var0); // L: 97

		for (var7 = 0; var7 < 4; ++var7) { // L: 98
			for (var8 = 0; var8 < 64; ++var8) { // L: 99
				for (int var9 = 0; var9 < 64; ++var9) { // L: 100
					int var10 = var8 + var1; // L: 101
					int var11 = var9 + var2; // L: 102
					class182.loadTerrain(var12, var7, var10, var11, var3 + var10, var11 + var4, 0); // L: 103
				}
			}
		}

	} // L: 107
}
