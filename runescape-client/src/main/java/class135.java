import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
final class class135 implements ThreadFactory {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	static IndexedSprite field1595;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load"); // L: 49
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1581557005"
	)
	public static void method3129() {
		PlayerComposition.PlayerComposition_cachedModels.clear(); // L: 307
	} // L: 308

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1434511630"
	)
	static long method3132() {
		return Client.field675; // L: 2950
	}
}
