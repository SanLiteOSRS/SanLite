import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1593246089
	)
	@Export("type")
	int type;
	@ObfuscatedName("b")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Llt;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "23"
	)
	static final int method4291() {
		return ViewportMouse.ViewportMouse_x;
	}
}
