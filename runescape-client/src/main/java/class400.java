import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
public class class400 extends class406 {
	@ObfuscatedSignature(
		descriptor = "(Lps;)V"
	)
	public class400(class406 var1) {
		super(var1); // L: 8
		super.field4513 = "SwapSongTask"; // L: 9
	} // L: 10

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1705548260"
	)
	public boolean vmethod7648(int var1) {
		if (class305.field3397.size() > 1 && class305.field3397.get(0) != null && ((class317)class305.field3397.get(0)).field3511.isReady() && class305.field3397.get(1) != null && ((class317)class305.field3397.get(1)).field3511.isReady()) { // L: 14
			class317 var2 = (class317)class305.field3397.get(0); // L: 15
			class305.field3397.set(0, class305.field3397.get(1)); // L: 16
			class305.field3397.set(1, var2); // L: 17
		}

		return true; // L: 19
	}
}
