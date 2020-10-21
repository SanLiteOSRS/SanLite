import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class206 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("musicPatchesArchive")
	static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("musicSamplesArchive")
	static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("soundEffectsArchive")
	static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 60389351
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2127739397
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2078097639
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;

	static {
		musicPlayerStatus = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "1369090733"
	)
	public static boolean method3851() {
		ReflectionCheck var0 = (ReflectionCheck)class105.reflectionChecks.last();
		return var0 != null;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)Lgk;",
		garbageValue = "-1404653901"
	)
	public static PacketBufferNode method3853() {
		PacketBufferNode var0 = ChatChannel.method2363();
		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "2122026664"
	)
	public static void method3852(int var0) {
		if (var0 != -1) {
			if (Widget.Widget_loadedInterfaces[var0]) {
				Decimator.Widget_archive.clearFilesGroup(var0);
				if (Widget.Widget_interfaceComponents[var0] != null) {
					boolean var1 = true;

					for (int var2 = 0; var2 < Widget.Widget_interfaceComponents[var0].length; ++var2) {
						if (Widget.Widget_interfaceComponents[var0][var2] != null) {
							if (Widget.Widget_interfaceComponents[var0][var2].type != 2) {
								Widget.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false;
							}
						}
					}

					if (var1) {
						Widget.Widget_interfaceComponents[var0] = null;
					}

					Widget.Widget_loadedInterfaces[var0] = false;
				}
			}
		}
	}
}
