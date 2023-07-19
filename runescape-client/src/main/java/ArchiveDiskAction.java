import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 172115557
	)
	@Export("type")
	int type;
	@ObfuscatedName("aj")
	@Export("data")
	byte[] data;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	} // L: 12
}
