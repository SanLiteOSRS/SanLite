import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
public class class322 {
	static {
		Math.sqrt(8192.0D); // L: 9
	} // L: 10

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(III)Lgt;",
		garbageValue = "-874062293"
	)
	static RouteStrategy method6431(int var0, int var1) {
		Client.field544.approxDestinationX = var0; // L: 9218
		Client.field544.approxDestinationY = var1; // L: 9219
		Client.field544.approxDestinationSizeX = 1; // L: 9220
		Client.field544.approxDestinationSizeY = 1; // L: 9221
		return Client.field544; // L: 9222
	}
}
