import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
public class class349 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;B)I",
		garbageValue = "-48"
	)
	static int method6675(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0; // L: 168
		String[] var3 = Login.field950; // L: 170

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) { // L: 171
			var5 = var3[var4]; // L: 172
			if (var0.tryLoadFileByNames(var5, "")) { // L: 174
				++var2; // L: 175
			}
		}

		var3 = Login.field951; // L: 181

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 182
			var5 = var3[var4]; // L: 183
			if (var1.tryLoadFileByNames(var5, "")) { // L: 185
				++var2; // L: 186
			}
		}

		var3 = Login.field925; // L: 192

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 193
			var5 = var3[var4]; // L: 194
			if (var1.getGroupId(var5) != -1 && var1.tryLoadFileByNames(var5, "")) { // L: 196
				++var2; // L: 197
			}
		}

		return var2; // L: 202
	}
}
