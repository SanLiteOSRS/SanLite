import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class405 {
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "60"
	)
	static final int method7613(int var0) {
		return Math.abs(var0 - Coord.cameraYaw) > 1024 ? (var0 < Coord.cameraYaw ? 1 : -1) * 2048 + var0 : var0; // L: 3874 3875
	}
}
