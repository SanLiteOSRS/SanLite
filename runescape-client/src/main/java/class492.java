import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
public final class class492 {
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "450337237"
	)
	static final void method8853() {
		if (Client.logoutTimer > 0) { // L: 3129
			class105.logOut(); // L: 3130
		} else {
			Client.timer.method7586(); // L: 3133
			class47.method867(40); // L: 3134
			GrandExchangeOfferAgeComparator.field4310 = Client.packetWriter.getSocket(); // L: 3135
			Client.packetWriter.removeSocket(); // L: 3136
		}
	} // L: 3131 3137
}
