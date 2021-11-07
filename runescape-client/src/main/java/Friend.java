import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("i")
	boolean field3942;
	@ObfuscatedName("w")
	boolean field3941;

	Friend() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Llv;I)I",
		garbageValue = "-1418759266"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field3942 && !var1.field3942) {
			return -1;
		} else if (!this.field3942 && var1.field3942) {
			return 1;
		} else if (this.field3941 && !var1.field3941) {
			return -1;
		} else if (!this.field3941 && var1.field3941) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)I",
		garbageValue = "-1073614160"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1293240706"
	)
	static void method6057(int var0, int var1) {
		if (class408.clientPreferences.musicVolume != 0 && var0 != -1) {
			Archive var2 = AbstractWorldMapIcon.archive11;
			int var3 = class408.clientPreferences.musicVolume;
			class247.musicPlayerStatus = 1;
			class128.musicTrackArchive = var2;
			class411.musicTrackGroupId = var0;
			ArchiveDiskActionHandler.musicTrackFileId = 0;
			class247.musicTrackVolume = var3;
			SecureRandomCallable.musicTrackBoolean = false;
			class247.pcmSampleLength = 10000;
			Client.field710 = true;
		}

	}
}
