import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class8 implements Callable {
	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		signature = "Lfq;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("at")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lkb;"
	)
	final Buffer field35;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Ln;"
	)
	final class12 field31;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lt;"
	)
	final class9 this$0;

	@ObfuscatedSignature(
		signature = "(Lt;Lkb;Ln;)V"
	)
	class8(class9 var1, Buffer var2, class12 var3) {
		this.this$0 = var1;
		this.field35 = var2;
		this.field31 = var3;
	}

	public Object call() {
		return this.field31.vmethod145(this.field35);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)[Lih;",
		garbageValue = "1246224952"
	)
	static class238[] method116() {
		return new class238[]{class238.field3116, class238.field3113};
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIII)J",
		garbageValue = "1560484309"
	)
	static long method117(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "-2023789845"
	)
	public static byte[] method113(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) {
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) {
				var2[var3] = -128;
			} else if (var4 == 8218) {
				var2[var3] = -126;
			} else if (var4 == 402) {
				var2[var3] = -125;
			} else if (var4 == 8222) {
				var2[var3] = -124;
			} else if (var4 == 8230) {
				var2[var3] = -123;
			} else if (var4 == 8224) {
				var2[var3] = -122;
			} else if (var4 == 8225) {
				var2[var3] = -121;
			} else if (var4 == 710) {
				var2[var3] = -120;
			} else if (var4 == 8240) {
				var2[var3] = -119;
			} else if (var4 == 352) {
				var2[var3] = -118;
			} else if (var4 == 8249) {
				var2[var3] = -117;
			} else if (var4 == 338) {
				var2[var3] = -116;
			} else if (var4 == 381) {
				var2[var3] = -114;
			} else if (var4 == 8216) {
				var2[var3] = -111;
			} else if (var4 == 8217) {
				var2[var3] = -110;
			} else if (var4 == 8220) {
				var2[var3] = -109;
			} else if (var4 == 8221) {
				var2[var3] = -108;
			} else if (var4 == 8226) {
				var2[var3] = -107;
			} else if (var4 == 8211) {
				var2[var3] = -106;
			} else if (var4 == 8212) {
				var2[var3] = -105;
			} else if (var4 == 732) {
				var2[var3] = -104;
			} else if (var4 == 8482) {
				var2[var3] = -103;
			} else if (var4 == 353) {
				var2[var3] = -102;
			} else if (var4 == 8250) {
				var2[var3] = -101;
			} else if (var4 == 339) {
				var2[var3] = -100;
			} else if (var4 == 382) {
				var2[var3] = -98;
			} else if (var4 == 376) {
				var2[var3] = -97;
			} else {
				var2[var3] = 63;
			}
		}

		return var2;
	}
}
