import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("se")
	@ObfuscatedGetter(
		longValue = 9135333041797517911L
	)
	static long field1081;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lbv;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 426962571
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbv;",
		garbageValue = "-17263542"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99];

		for (int var6 = this.count; var6 > 0; --var6) {
			if (var6 != 100) {
				this.messages[var6] = this.messages[var6 - 1];
			}
		}

		if (var5 == null) {
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove();
			var5.removeDual();
			var5.set(var1, var2, var4, var3);
		}

		this.messages[0] = var5;
		if (this.count < 100) {
			++this.count;
		}

		return var5;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbv;",
		garbageValue = "29"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-294918247"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "1815997374"
	)
	public static int method2042(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) {
				var0[var4++] = (byte)var6;
			} else if (var6 <= 2047) {
				var0[var4++] = (byte)(192 | var6 >> 6);
				var0[var4++] = (byte)(128 | var6 & '?');
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f');
				var0[var4++] = (byte)(128 | var6 >> 6 & 63);
				var0[var4++] = (byte)(128 | var6 & '?');
			}
		}

		return var4 - var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljp;II)Lof;",
		garbageValue = "-2132120014"
	)
	public static IndexedSprite method2043(AbstractArchive var0, int var1) {
		return !UserComparator5.method2465(var0, var1) ? null : GraphicsObject.method1938();
	}
}
