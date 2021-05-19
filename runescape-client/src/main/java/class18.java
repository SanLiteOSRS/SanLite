import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class18 extends class14 {
	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static class285 field154;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = -1116258304
	)
	static int field157;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static Bounds field155;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 91445281
	)
	int field152;
	@ObfuscatedName("c")
	boolean field151;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class18(class2 var1) {
		this.this$0 = var1;
		this.field152 = -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field152 = var1.readUnsignedShort();
		this.field151 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method133(this.field152, this.field151);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "114"
	)
	static int method255(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lcl;ZI)V",
		garbageValue = "-1411385437"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			WallDecoration.method4234(var2);
		}

		TaskHandler.method2515(var2);
		Widget var4 = DevicePcmPlayerProvider.getWidget(var3);
		if (var4 != null) {
			VerticalAlignment.invalidateWidget(var4);
		}

		GrandExchangeOfferOwnWorldComparator.method1212();
		if (Client.rootInterface != -1) {
			LoginType.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
