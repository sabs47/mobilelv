# This file contains the fastlane.tools configuration
# You can find the documentation at https://docs.fastlane.tools
#
# For a list of all available actions, check out
#
#     https://docs.fastlane.tools/actions
#
# For a list of all available plugins, check out
#
#     https://docs.fastlane.tools/plugins/available-plugins
#

# Uncomment the line if you want fastlane to automatically update itself
# update_fastlane

default_platform(:ios)
platform :ios do
  desc "Description of what the lane does"
  lane :generate_ipa_develop do
    build_ios_app(
      configuration: "Debug",
      scheme: "tests (iOS)",
      clean: true,
      export_method: 'development',
      output_directory: "~/Desktop", # Destination directory. Defaults to current directory.
      output_name: "fastlane_jenkins.ipa",
    )
  end
end

