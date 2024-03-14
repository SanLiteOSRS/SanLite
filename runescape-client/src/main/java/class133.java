import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class133 implements class390 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1590;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1580;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1586;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1591;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1583;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1584;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 242390253
	)
	static int field1589;
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2124289167
	)
	final int field1585;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1368643101
	)
	final int field1593;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2111787893
	)
	final int field1587;

	static {
		field1590 = new class133(0, 0, (String)null, 0); // L: 14
		field1580 = new class133(1, 1, (String)null, 9); // L: 15
		field1586 = new class133(2, 2, (String)null, 3); // L: 16
		field1591 = new class133(3, 3, (String)null, 6); // L: 17
		field1583 = new class133(4, 4, (String)null, 1);
		field1584 = new class133(5, 5, (String)null, 3); // L: 19
	}

	class133(int var1, int var2, String var3, int var4) {
		this.field1585 = var1; // L: 25
		this.field1593 = var2; // L: 26
		this.field1587 = var4; // L: 27
	} // L: 28

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1593; // L: 36
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "91"
	)
	int method3111() {
		return this.field1587; // L: 31
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public static int method3115(int var0) {
		return var0 >>> 12; // L: 18
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "-2"
	)
	public static void method3120(ArrayList var0, int var1, int var2, int var3, int var4) {
		class321.field3484.clear(); // L: 203
		class321.field3484.addAll(var0); // L: 204
		ScriptFrame.method1158(var1, var2, var3, var4); // L: 205
	} // L: 206

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	static final void method3119() {
		class183.field1927.clear(); // L: 3034
		class185.FloorUnderlayDefinition_cached.clear(); // L: 3037
		class160.method3424(); // L: 3039
		KitDefinition.method3630(); // L: 3040
		class168.method3505(); // L: 3041
		class257.method5048(); // L: 3042
		class132.method3109(); // L: 3043
		class14.method165(); // L: 3044
		GroundObject.method5268(); // L: 3045
		class59.method1129(); // L: 3046
		class173.field1844.clear(); // L: 3048
		SequenceDefinition.method4104(); // L: 3050
		ClientPacket.method6032(); // L: 3051
		class151.method3279(); // L: 3052
		class30.method420(); // L: 3053
		ItemContainer.method2347(); // L: 3054
		MusicPatchPcmStream.method6372(); // L: 3055
		class190.method3773(); // L: 3056
		ParamComposition.ParamComposition_cached.clear(); // L: 3058
		ModeWhere.method7376(); // L: 3060
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 3062
		SpotAnimationDefinition.field2036.clear(); // L: 3063
		StructComposition.StructDefinition_cached.clear(); // L: 3066
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 3069
		if (EnumComposition.field1931 != null) { // L: 3071
			EnumComposition.field1931.method9275();
		}

		if (ApproximateRouteStrategy.field488 != null) { // L: 3072
			ApproximateRouteStrategy.field488.method9275();
		}

		class31.method430(); // L: 3073
		class192.field2022.clear(); // L: 3075
		VarcInt.VarcInt_cached.clear(); // L: 3078
		class177.field1864.clear(); // L: 3081
		class172.field1842.clear(); // L: 3084
		class175.field1851.clear(); // L: 3087
		class198.field2067.clear(); // L: 3090
		HorizontalAlignment.method3694(); // L: 3092
		class196.field2058.clear(); // L: 3094
		Client.Widget_cachedModels.clear(); // L: 3096
		Client.Widget_cachedFonts.clear(); // L: 3097
		PlayerComposition.PlayerComposition_cachedModels.clear(); // L: 3099
		PlayerComposition.field3674.method8197(); // L: 3100
		PlayerComposition.field3661 = 0; // L: 3101
		if (ArchiveLoader.field1070 != null) { // L: 3103
			ArchiveLoader.field1070.method6436();
		}

		if (Rasterizer3D.field2820.Rasterizer3D_textureLoader != null) { // L: 3104
			((TextureProvider)Rasterizer3D.field2820.Rasterizer3D_textureLoader).clear();
		}

		Script.Script_cached.clear(); // L: 3106
		Client.field821.method8197(); // L: 3108
		if (class154.field1724 != null) { // L: 3109
			class154.field1724.clearFiles();
		}

		if (Client.field556 != null) { // L: 3110
			Client.field556.clearFiles();
		}

		if (ScriptFrame.field468 != null) { // L: 3111
			ScriptFrame.field468.clearFiles();
		}

		if (WorldMapSectionType.archive12 != null) { // L: 3112
			WorldMapSectionType.archive12.clearFiles();
		}

		if (class19.archive2 != null) { // L: 3113
			class19.archive2.clearFiles();
		}

		if (class150.field1703 != null) { // L: 3114
			class150.field1703.clearFiles();
		}

		if (class12.field52 != null) { // L: 3115
			class12.field52.clearFiles();
		}

		if (class25.archive13 != null) { // L: 3116
			class25.archive13.clearFiles();
		}

		if (ScriptFrame.field464 != null) { // L: 3117
			ScriptFrame.field464.clearFiles();
		}

		if (MouseHandler.field239 != null) { // L: 3118
			MouseHandler.field239.clearFiles();
		}

		if (class376.field4387 != null) { // L: 3119
			class376.field4387.clearFiles();
		}

		if (WorldMapSectionType.field2612 != null) { // L: 3120
			WorldMapSectionType.field2612.clearFiles();
		}

		if (JagexCache.field2336 != null) { // L: 3121
			JagexCache.field2336.clearFiles();
		}

		if (Renderable.field2921 != null) { // L: 3122
			Renderable.field2921.clearFiles();
		}

		if (class198.field2070 != null) { // L: 3123
			class198.field2070.clearFiles();
		}

		if (class86.field1084 != null) { // L: 3124
			class86.field1084.clearFiles();
		}

		if (class311.field3274 != null) { // L: 3125
			class311.field3274.clearFiles();
		}

		if (Varcs.field1417 != null) { // L: 3126
			Varcs.field1417.clearFiles();
		}

		if (class391.field4483 != null) { // L: 3127
			class391.field4483.clearFiles();
		}

		if (class362.field3958 != null) { // L: 3128
			class362.field3958.clearFiles();
		}

		if (SpotAnimationDefinition.field2045 != null) { // L: 3129
			SpotAnimationDefinition.field2045.clearFiles();
		}

		if (class170.field1832 != null) { // L: 3130
			class170.field1832.clearFiles();
		}

	} // L: 3131

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1122616449"
	)
	static final void method3113(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12740
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3481()) { // L: 12741
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12742
				if (var2.rank == -1) { // L: 12743
					PacketBufferNode var3 = ViewportMouse.getPacketBufferNode(ClientPacket.field3255, Client.packetWriter.isaacCipher); // L: 12744
					var3.packetBuffer.writeByte(3 + class145.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12745
					var3.packetBuffer.writeByte(var0); // L: 12746
					var3.packetBuffer.writeShort(var1); // L: 12747
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12748
					Client.packetWriter.addNode(var3); // L: 12749
				}
			}
		}
	} // L: 12750
}
