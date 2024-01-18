import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lco;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1778194045
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 90
	} // L: 93

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lco;",
		garbageValue = "-1048847544"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 96

		for (int var6 = this.count; var6 > 0; --var6) { // L: 97
			if (var6 != 100) { // L: 98
				this.messages[var6] = this.messages[var6 - 1]; // L: 99
			}
		}

		if (var5 == null) { // L: 101
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 103
			var5.removeDual(); // L: 104
			var5.set(var1, var2, var4, var3); // L: 105
		}

		this.messages[0] = var5; // L: 107
		if (this.count < 100) { // L: 108
			++this.count;
		}

		return var5; // L: 109
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lco;",
		garbageValue = "-1849782828"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 113 114
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2082470699"
	)
	@Export("size")
	int size() {
		return this.count; // L: 118
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldw;",
		garbageValue = "1161731681"
	)
	static class89[] method2271() {
		return new class89[]{class89.field1082, class89.field1079, class89.field1080, class89.field1085, class89.field1078}; // L: 16
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnn;II)V",
		garbageValue = "-2075138403"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3775 == null) { // L: 1278
			throw new RuntimeException(); // L: 1279
		} else {
			if (var0.field3847 == null) { // L: 1281
				var0.field3847 = new int[var0.field3775.length]; // L: 1282
			}

			var0.field3847[var1] = Integer.MAX_VALUE; // L: 1284
		}
	} // L: 1285

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(IZZZZB)Loz;",
		garbageValue = "111"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 1980
		if (JagexCache.JagexCache_dat2File != null) { // L: 1981
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000); // L: 1982
		}

		return new Archive(var5, class357.field3922, UrlRequester.field1418, var0, var1, var2, var3, var4, false); // L: 1984
	}
}
