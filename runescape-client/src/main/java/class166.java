import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class166 extends class159 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("ItemComposition_modelArchive")
	public static AbstractArchive ItemComposition_modelArchive;
	@ObfuscatedName("jb")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("am")
	String field1784;
	@ObfuscatedName("ap")
	byte field1788;
	@ObfuscatedName("af")
	byte field1783;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;)V"
	)
	class166(class160 var1) {
		this.this$0 = var1; // L: 157
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1814222712"
	)
	void vmethod3518(Buffer var1) {
		this.field1784 = var1.readStringCp1252NullTerminatedOrNull(); // L: 160
		if (this.field1784 != null) { // L: 161
			var1.readUnsignedByte(); // L: 162
			this.field1788 = var1.readByte(); // L: 163
			this.field1783 = var1.readByte(); // L: 164
		}

	} // L: 166

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "1662663599"
	)
	void vmethod3519(ClanChannel var1) {
		var1.name = this.field1784; // L: 169
		if (this.field1784 != null) { // L: 170
			var1.field1758 = this.field1788; // L: 171
			var1.field1767 = this.field1783; // L: 172
		}

	} // L: 174
}
