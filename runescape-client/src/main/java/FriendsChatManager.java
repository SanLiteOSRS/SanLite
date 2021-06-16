import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = 1112314023
	)
	static int field3815;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("y")
	@Export("name")
	public String name;
	@ObfuscatedName("j")
	@Export("owner")
	public String owner;
	@ObfuscatedName("o")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1281242043
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2021937321
	)
	int field3821;

	@ObfuscatedSignature(
		descriptor = "(Lnb;Llz;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(100);
		this.name = null;
		this.owner = null;
		this.field3821 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Llf;",
		garbageValue = "1590299985"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)[Llf;",
		garbageValue = "-1320557093"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "370345592"
	)
	@Export("readName")
	final void readName(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) {
			var5 /= 37L;
		}

		String var10 = class80.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.name = var10;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "919584410"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && 0L != var5) {
			var5 /= 37L;
		}

		String var10 = class80.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.owner = var10;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1598769296"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		long var5 = var2;
		String var4;
		int var7;
		if (var2 > 0L && var2 < 6582952005840035281L) {
			if (0L == var2 % 37L) {
				var4 = null;
			} else {
				var7 = 0;

				for (long var8 = var2; 0L != var8; var8 /= 37L) {
					++var7;
				}

				StringBuilder var10 = new StringBuilder(var7);

				while (var5 != 0L) {
					long var11 = var5;
					var5 /= 37L;
					var10.append(class306.base37Table[(int)(var11 - 37L * var5)]);
				}

				var4 = var10.reverse().toString();
			}
		} else {
			var4 = null;
		}

		this.readName(var4);
		this.minKick = var1.readByte();
		var7 = var1.readUnsignedByte();
		if (var7 != 255) {
			this.clear();

			for (int var13 = 0; var13 < var7; ++var13) {
				FriendsChatMember var9 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var14 = var1.readUnsignedShort();
				var9.set(var14, ++this.field3821 - 1);
				var9.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var9);
			}

		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1315927757"
	)
	public final void method5751(Buffer var1) {
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
				this.remove(var6);
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

			var6.set(var3, ++this.field3821 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "24878188"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Llt;I)V",
		garbageValue = "1528059933"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "1551905858"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					var2 = GrandExchangeOfferNameComparator.method5193(var1);
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + RunException.RunException_revision + "&u=" + Login.field1026 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + GZipDecompressor.clientType + "&e=" + var2);
				DataInputStream var4 = new DataInputStream(var3.openStream());
				var4.read();
				var4.close();
			} catch (Exception var5) {
			}

		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	static void method5760() {
		if (Client.oculusOrbState == 1) {
			Client.field705 = true;
		}

	}
}
