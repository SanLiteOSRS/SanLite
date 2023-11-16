import java.awt.Image;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class151 extends class144 {
	@ObfuscatedName("bg")
	static Image field1682;
	@ObfuscatedName("at")
	boolean field1677;
	@ObfuscatedName("ah")
	byte field1678;
	@ObfuscatedName("ar")
	byte field1680;
	@ObfuscatedName("ao")
	byte field1679;
	@ObfuscatedName("ab")
	byte field1681;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class151(class147 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-734756620"
	)
	void vmethod3510(Buffer var1) {
		this.field1677 = var1.readUnsignedByte() == 1; // L: 251
		this.field1678 = var1.readByte(); // L: 252
		this.field1680 = var1.readByte(); // L: 253
		this.field1679 = var1.readByte(); // L: 254
		this.field1681 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V",
		garbageValue = "-2111347169"
	)
	void vmethod3506(ClanSettings var1) {
		var1.allowGuests = this.field1677; // L: 259
		var1.field1705 = this.field1678; // L: 260
		var1.field1706 = this.field1680; // L: 261
		var1.field1707 = this.field1679; // L: 262
		var1.field1708 = this.field1681; // L: 263
	} // L: 264

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lfo;",
		garbageValue = "1476785465"
	)
	static class139 method3292(int var0) {
		if (MouseRecorder.method2372(var0) != 0) { // L: 375
			return null; // L: 376
		} else {
			class139 var2 = (class139)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 380
			class139 var1;
			if (var2 != null) { // L: 381
				var1 = var2; // L: 382
			} else {
				var2 = Login.method2197(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 385
				if (var2 != null) { // L: 386
					SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
				}

				var1 = var2; // L: 387
			}

			return var1; // L: 389
		}
	}
}
