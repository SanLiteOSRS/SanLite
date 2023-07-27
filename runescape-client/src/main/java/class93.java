import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class93 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-263879451"
	)
	static int method2370() {
		return Login.loginIndex; // L: 2162
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1274720283"
	)
	static final void method2369() {
		if (Client.logoutTimer > 0) { // L: 3093
			WorldMapScaleHandler.logOut(); // L: 3094
		} else {
			Client.timer.method7724(); // L: 3097
			class129.method2989(40); // L: 3098
			UserComparator5.field1461 = Client.packetWriter.getSocket(); // L: 3099
			Client.packetWriter.removeSocket(); // L: 3100
		}
	} // L: 3095 3101
}
