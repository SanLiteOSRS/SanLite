import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
class class368 implements Iterator {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -966003963
	)
	int field4126;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	final class369 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lno;)V"
	)
	class368(class369 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field4126 < this.this$0.method5863();
	}

	public Object next() {
		int var1 = ++this.field4126 - 1;
		class341 var2 = (class341)this.this$0.field4129.get((long)var1);
		return var2 != null ? var2 : this.this$0.method6301(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "0"
	)
	public static String method6299(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = DirectByteArrayCopier.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}
}
