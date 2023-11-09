import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public class class401 extends class407 {
	@ObfuscatedSignature(
		descriptor = "(Lpp;)V"
	)
	public class401(class407 var1) {
		super(var1); // L: 8
		super.field4528 = "SwapSongTask"; // L: 9
	} // L: 10

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		if (class306.field3394.size() > 1 && class306.field3394.get(0) != null && ((class318)class306.field3394.get(0)).field3516.isReady() && class306.field3394.get(1) != null && ((class318)class306.field3394.get(1)).field3516.isReady()) { // L: 14
			class318 var2 = (class318)class306.field3394.get(0); // L: 15
			class306.field3394.set(0, class306.field3394.get(1)); // L: 16
			class306.field3394.set(1, var2); // L: 17
		}

		return true; // L: 19
	}
}
