import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
public class class339 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1501316877
	)
	public int field3591;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1917639115
	)
	public int field3592;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2044708723
	)
	public int field3593;

	class339() {
	} // L: 8

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-250555554"
	)
	static void method6258() {
		GameEngine.method647(24); // L: 2012
		AbstractWorldMapIcon.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 2013
	} // L: 2014
}
