import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
public class class414 extends class418 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("soundSystem")
	public static SoundSystem soundSystem;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 6821196167292438109L
	)
	long field4544;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1192126365
	)
	int field4543;

	@ObfuscatedSignature(
		descriptor = "(Lql;I)V"
	)
	public class414(class418 var1, int var2) {
		super(var1); // L: 8
		this.field4543 = var2; // L: 9
		super.field4552 = "DelayFadeTask"; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		if (this.field4544 < (long)this.field4543) { // L: 15
			++this.field4544; // L: 16
			return false; // L: 17
		} else {
			return true; // L: 19
		}
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-52"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Canvas.method332(); // L: 12661
		if (class20.friendsChatManager != null) { // L: 12662
			class20.friendsChatManager.invalidateIgnoreds(); // L: 12663
		}

	} // L: 12665
}
