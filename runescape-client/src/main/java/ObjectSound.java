import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("friendsChatManager")
	static FriendsChatManager friendsChatManager;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -21377183
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2066484608
	)
	@Export("x")
	int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 408211455
	)
	@Export("y")
	int y;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 810499873
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 530853631
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1306333519
	)
	int field848;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1121071337
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1853335345
	)
	int field841;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -999983233
	)
	int field842;
	@ObfuscatedName("ao")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1209388873
	)
	int field844;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2062209453"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 44
		ObjectComposition var2 = this.obj.transform(); // L: 45
		if (var2 != null) { // L: 46
			this.soundEffectId = var2.ambientSoundId; // L: 47
			this.field848 = var2.int7 * 128; // L: 48
			this.field841 = var2.int5; // L: 49
			this.field842 = var2.int6; // L: 50
			this.soundEffectIds = var2.soundEffectIds; // L: 51
		} else {
			this.soundEffectId = -1; // L: 54
			this.field848 = 0; // L: 55
			this.field841 = 0; // L: 56
			this.field842 = 0; // L: 57
			this.soundEffectIds = null; // L: 58
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 60
			ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(this.stream1); // L: 61
			this.stream1 = null; // L: 62
		}

	} // L: 64

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1885033639"
	)
	static void method1926(int var0) {
		if (var0 != Login.loginIndex) { // L: 2197
			Login.loginIndex = var0; // L: 2198
		}
	} // L: 2199

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-920191342"
	)
	static final void method1937(int var0, int var1) {
		if (var0 < 128) { // L: 4047
			var0 = 128; // L: 4048
		} else if (var0 > 383) { // L: 4050
			var0 = 383; // L: 4051
		}

		if (ModeWhere.cameraPitch < var0) { // L: 4053
			ModeWhere.cameraPitch = (var0 - ModeWhere.cameraPitch) * ClanChannelMember.field1656 / 1000 + ModeWhere.cameraPitch + MenuAction.field900; // L: 4054
			if (ModeWhere.cameraPitch > var0) { // L: 4055
				ModeWhere.cameraPitch = var0; // L: 4056
			}
		} else if (ModeWhere.cameraPitch > var0) { // L: 4059
			ModeWhere.cameraPitch -= (ModeWhere.cameraPitch - var0) * ClanChannelMember.field1656 / 1000 + MenuAction.field900; // L: 4060
			if (ModeWhere.cameraPitch < var0) { // L: 4061
				ModeWhere.cameraPitch = var0; // L: 4062
			}
		}

		var1 &= 2047; // L: 4065
		int var2 = var1 - class13.cameraYaw; // L: 4066
		if (var2 > 1024) { // L: 4067
			var2 -= 2048; // L: 4068
		} else if (var2 < -1024) { // L: 4070
			var2 += 2048; // L: 4071
		}

		if (var2 > 0) { // L: 4073
			class13.cameraYaw = var2 * ClanChannelMember.field1656 / 1000 + class13.cameraYaw + MenuAction.field900; // L: 4074
			class13.cameraYaw &= 2047; // L: 4075
		} else if (var2 < 0) { // L: 4077
			class13.cameraYaw -= MenuAction.field900 + -var2 * ClanChannelMember.field1656 / 1000; // L: 4078
			class13.cameraYaw &= 2047; // L: 4079
		}

		int var3 = var1 - class13.cameraYaw; // L: 4081
		if (var3 > 1024) { // L: 4082
			var3 -= 2048; // L: 4083
		} else if (var3 < -1024) { // L: 4085
			var3 += 2048; // L: 4086
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 4088
			class13.cameraYaw = var1; // L: 4089
		}

	} // L: 4091
}
