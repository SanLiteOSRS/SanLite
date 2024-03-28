import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class153 extends class144 {
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field1726;
	@ObfuscatedName("az")
	String field1725;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class153(class147 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		this.field1725 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.name = this.field1725; // L: 237
	} // L: 238

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Loc;Ljava/lang/String;Ljava/lang/String;I)Lvl;",
		garbageValue = "-802580152"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 106
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 107
			int var4 = var0.getFileId(var3, var2); // L: 108
			return class384.method7113(var0, var3, var4); // L: 109
		}
	}
}
