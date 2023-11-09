import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class166 extends class159 {
	@ObfuscatedName("am")
	@Export("cacheParentPaths")
	public static String[] cacheParentPaths;
	@ObfuscatedName("ay")
	String field1789;
	@ObfuscatedName("an")
	byte field1785;
	@ObfuscatedName("ar")
	byte field1787;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgb;)V"
	)
	class166(class160 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "-105"
	)
	void vmethod3335(Buffer var1) {
		this.field1789 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1789 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1785 = var1.readByte(); // L: 161
			this.field1787 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "84"
	)
	void vmethod3337(ClanChannel var1) {
		var1.name = this.field1789; // L: 167
		if (this.field1789 != null) { // L: 168
			var1.field1762 = this.field1785; // L: 169
			var1.field1768 = this.field1787; // L: 170
		}

	} // L: 172

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "13189"
	)
	public static void method3342() {
		try {
			File var0 = new File(class133.userHomeDirectory, "random.dat"); // L: 210
			int var2;
			if (var0.exists()) { // L: 211
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 212
			} else {
				label39:
				for (int var1 = 0; var1 < class501.cacheSubPaths.length; ++var1) { // L: 215
					for (var2 = 0; var2 < cacheParentPaths.length; ++var2) { // L: 216
						File var3 = new File(cacheParentPaths[var2] + class501.cacheSubPaths[var1] + File.separatorChar + "random.dat"); // L: 217
						if (var3.exists()) { // L: 218
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 219
							break label39; // L: 220
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 225
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 226
				var2 = var4.read(); // L: 227
				var4.seek(0L); // L: 228
				var4.write(var2); // L: 229
				var4.seek(0L); // L: 230
				var4.close(); // L: 231
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 232
			}
		} catch (IOException var5) { // L: 235
		}

	} // L: 236

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-175534249"
	)
	static final void method3341(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 8933
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 8934
				Client.field701[var4] = true;
			}
		}

	} // L: 8936

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "([Lmo;Lmo;ZI)V",
		garbageValue = "-1372044994"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width; // L: 10815
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height; // L: 10816
		UserComparator6.resizeInterface(var0, var1.id, var3, var4, var2); // L: 10817
		if (var1.children != null) {
			UserComparator6.resizeInterface(var1.children, var1.id, var3, var4, var2); // L: 10818
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 10819
		if (var5 != null) { // L: 10820
			VarpDefinition.method3549(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) { // L: 10821
		}

	} // L: 10822
}
