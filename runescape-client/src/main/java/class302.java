import java.util.LinkedHashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public class class302 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	static final class302 field3551;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	static final class302 field3549;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1906155943
	)
	final int field3550;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1137794979
	)
	final int field3548;

	static {
		field3551 = new class302(51, 27, 800, 0, 16, 16);
		field3549 = new class302(25, 28, 800, 656, 40, 40);
	}

	class302(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3550 = var5;
		this.field3548 = var6;
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "15"
	)
	static final void method5766(boolean var0) {
		if (var0) {
			Client.field531 = Login.field907 ? class124.field1498 : class124.field1496;
		} else {
			LinkedHashMap var1 = class131.clientPreferences.parameters;
			String var3 = Login.Login_username;
			int var4 = var3.length();
			int var5 = 0;

			for (int var6 = 0; var6 < var4; ++var6) {
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field531 = var1.containsKey(var5) ? class124.field1501 : class124.field1495;
		}

	}
}
