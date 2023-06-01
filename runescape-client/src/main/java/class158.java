import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class158 extends class143 {
	@ObfuscatedName("we")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 6116517088136861109L
	)
	long field1732;
	@ObfuscatedName("an")
	String field1735;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 884784305
	)
	int field1733;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class158(class146 var1) {
		this.this$0 = var1;
		this.field1732 = -1L; // L: 93
		this.field1735 = null; // L: 94
		this.field1733 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	void vmethod3345(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field1732 = var1.readLong(); // L: 102
		}

		this.field1735 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field1733 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	void vmethod3346(ClanSettings var1) {
		var1.method3201(this.field1732, this.field1735, this.field1733); // L: 109
	} // L: 110

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lnv;",
		garbageValue = "-228452454"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 2105
		if (JagexCache.JagexCache_dat2File != null) { // L: 2106
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, class104.masterDisk, var0, var1, var2, var3, var4); // L: 2107
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Ldr;I)Z",
		garbageValue = "653559484"
	)
	static boolean method3283(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 5055
			return false;
		} else {
			boolean var1;
			if (HitSplatDefinition.localPlayer == var0) { // L: 5056
				var1 = (Client.drawPlayerNames & 8) != 0; // L: 5070
				return var1; // L: 5072
			} else {
				var1 = AbstractArchive.method6809(); // L: 5057
				if (!var1) { // L: 5058
					boolean var2 = (Client.drawPlayerNames & 1) != 0; // L: 5061
					var1 = var2 && var0.isFriend(); // L: 5063
				}

				return var1 || class306.method5824() && var0.isFriendsChatMember(); // L: 5065
			}
		}
	}
}
