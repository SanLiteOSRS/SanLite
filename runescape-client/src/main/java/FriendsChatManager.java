import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("s")
	@Export("name")
	public String name;
	@ObfuscatedName("z")
	@Export("owner")
	public String owner;
	@ObfuscatedName("j")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2029011203
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1510768557
	)
	int field4549;

	@ObfuscatedSignature(
		descriptor = "(Lqj;Lod;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4549 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "-2146736820"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember(); // L: 26
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)[Low;",
		garbageValue = "1411048209"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1]; // L: 31
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1846620710"
	)
	final void method7547(String var1) {
		String var3 = WorldMapSection1.base37DecodeLong(Decimator.method1122(var1)); // L: 37
		if (var3 == null) {
			var3 = ""; // L: 38
		}

		this.name = var3; // L: 41
	} // L: 42

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-11312"
	)
	final void method7571(String var1) {
		String var3 = WorldMapSection1.base37DecodeLong(Decimator.method1122(var1)); // L: 47
		if (var3 == null) {
			var3 = ""; // L: 48
		}

		this.owner = var3; // L: 51
	} // L: 52

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lrd;IB)V",
		garbageValue = "-45"
	)
	public final void method7554(Buffer var1, int var2) {
		this.method7571(var1.readStringCp1252NullTerminated()); // L: 55
		long var3 = var1.readLong(); // L: 56
		long var6 = var3; // L: 58
		String var5;
		int var8;
		if (var3 > 0L && var3 < 6582952005840035281L) { // L: 60
			if (0L == var3 % 37L) { // L: 64
				var5 = null; // L: 65
			} else {
				var8 = 0; // L: 68

				for (long var9 = var3; 0L != var9; var9 /= 37L) { // L: 69 70 72
					++var8; // L: 71
				}

				StringBuilder var11 = new StringBuilder(var8); // L: 74

				while (0L != var6) { // L: 75
					long var12 = var6; // L: 76
					var6 /= 37L; // L: 77
					var11.append(class366.base37Table[(int)(var12 - var6 * 37L)]); // L: 78
				}

				var5 = var11.reverse().toString(); // L: 80
			}
		} else {
			var5 = null; // L: 61
		}

		this.method7547(var5); // L: 82
		this.minKick = var1.readByte(); // L: 83
		short var14;
		if (var2 == 1) { // L: 86
			var8 = var1.readUnsignedByte(); // L: 87
			var14 = 255; // L: 88
		} else {
			if (var2 != 2) { // L: 90
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2); // L: 95
			}

			var8 = var1.method8660(); // L: 91
			var14 = -1; // L: 92
		}

		if (var14 != var8) { // L: 97
			int var10 = var8;
			this.clear();

			for (int var15 = 0; var15 < var10; ++var15) {
				FriendsChatMember var16 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var13 = var1.readUnsignedShort();
				var16.set(var13, ++this.field4549 - 1);
				var16.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var16);
			}

		}
	} // L: 98 110

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "-1851669074"
	)
	public final void method7550(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
		int var3 = var1.readUnsignedShort();
		byte var4 = var1.readByte();
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}

		FriendsChatMember var6;
		if (var5) {
			if (this.getSize() == 0) {
				return;
			}

			var6 = (FriendsChatMember)this.getByCurrentUsername(var2);
			if (var6 != null && var6.getWorld() == var3) {
				this.remove(var6); // L: 122
			}
		} else {
			var1.readStringCp1252NullTerminated();
			var6 = (FriendsChatMember)this.getByCurrentUsername(var2);
			if (var6 == null) {
				if (this.getSize() > super.capacity) {
					return;
				}

				var6 = (FriendsChatMember)this.addLastNoPreviousUsername(var2);
			}

			var6.set(var3, ++this.field4549 - 1);
			var6.rank = var4; // L: 133
			this.isLocalPlayer(var6); // L: 134
		}

	} // L: 136

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2134376992"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 139
			((FriendsChatMember)this.get(var1)).clearIsFriend(); // L: 140
		}

	} // L: 142

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1757065575"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 145
			((FriendsChatMember)this.get(var1)).clearIsIgnored(); // L: 146
		}

	} // L: 148

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Log;I)V",
		garbageValue = "1461880973"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 151
			this.rank = var1.rank;
		}

	} // L: 152

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1334053508"
	)
	static final void method7573() {
		if (!ViewportMouse.ViewportMouse_false0) { // L: 99
			int var0 = Scene.Scene_cameraPitchSine; // L: 100
			int var1 = Scene.Scene_cameraPitchCosine; // L: 101
			int var2 = Scene.Scene_cameraYawSine; // L: 102
			int var3 = Scene.Scene_cameraYawCosine; // L: 103
			byte var4 = 50; // L: 104
			short var5 = 3500; // L: 105
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 106
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 107
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 108
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 109
			int var10 = Rasterizer3D.method4354(var7, var4, var1, var0); // L: 111
			int var11 = Rasterizer3D.method4352(var7, var4, var1, var0); // L: 112
			var7 = var10; // L: 113
			var10 = Rasterizer3D.method4354(var9, var5, var1, var0); // L: 114
			int var12 = Rasterizer3D.method4352(var9, var5, var1, var0); // L: 115
			var9 = var10; // L: 116
			var10 = Rasterizer3D.method4349(var6, var11, var3, var2); // L: 117
			var11 = Rasterizer3D.method4350(var6, var11, var3, var2); // L: 118
			var6 = var10; // L: 119
			var10 = Rasterizer3D.method4349(var8, var12, var3, var2); // L: 120
			var12 = Rasterizer3D.method4350(var8, var12, var3, var2); // L: 121
			class148.field1702 = (var6 + var10) / 2; // L: 123
			GrandExchangeEvent.field4284 = (var7 + var9) / 2; // L: 124
			ViewportMouse.field2744 = (var12 + var11) / 2; // L: 125
			class419.field4661 = (var10 - var6) / 2; // L: 126
			VerticalAlignment.field2071 = (var9 - var7) / 2; // L: 127
			class14.field79 = (var12 - var11) / 2; // L: 128
			class172.field1868 = Math.abs(class419.field4661); // L: 129
			class137.field1639 = Math.abs(VerticalAlignment.field2071); // L: 130
			class151.field1743 = Math.abs(class14.field79); // L: 131
		}
	} // L: 132

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-866294822"
	)
	static void method7572() {
		PacketWriter.clientPreferences.method2502(Client.field501); // L: 13379
	} // L: 13380
}
