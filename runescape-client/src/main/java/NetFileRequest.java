import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1816786653
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("f")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-552402310"
	)
	static final void method4912() {
		if (Client.logoutTimer > 0) {
			class7.logOut();
		} else {
			Client.timer.method5590();
			class12.updateGameState(40);
			Client.field688 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
