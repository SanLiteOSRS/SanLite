import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
public class class349 {
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "709882847"
	)
	static final void method6839() {
		if (Client.logoutTimer > 0) { // L: 2817
			class31.logOut(); // L: 2818
		} else {
			Client.timer.method7613(); // L: 2821
			class138.method3208(40); // L: 2822
			class333.field3824 = Client.packetWriter.getSocket(); // L: 2823
			Client.packetWriter.removeSocket(); // L: 2824
		}
	} // L: 2819 2825
}
